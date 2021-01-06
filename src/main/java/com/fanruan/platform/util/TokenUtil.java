package com.fanruan.platform.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fanruan.platform.bean.User;
import io.jsonwebtoken.Jwts;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TokenUtil {

    private static final long EXPIRE_TIME= 24*60*60*1000;
    private static final String TOKEN_SECRET="credit";  //密钥盐
    private static final String TOKEN_SECRET_LOGIN_OUT="credit_out";  //密钥盐
    private static final  HashMap<String,String> tokenMap = new HashMap<>();
    /**
     * 签名生成
     * @param user
     * @return
     */
    public static String sign(User user){
        String token = null;
        try {
            Date expiresAt = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            token = JWT.create()
                    .withIssuer("auth0")
                    .withClaim("username", user.getUsername())
                    .withExpiresAt(expiresAt)
                    // 使用了HMAC256加密算法。
                    .sign(Algorithm.HMAC256(TOKEN_SECRET));
            tokenMap.put(user.getUsername(),token);
        } catch (Exception e){
            e.printStackTrace();
        }
       // return token;
        return tokenMap.get(user.getUsername());
    }

    /**
     * 签名生成
     * @param user
     * @return
     */
    public static String signOut(User user){
        String token = null;
        try {
            Date expiresAt = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            token = JWT.create()
                    .withIssuer("auth0")
                    .withClaim("username", user.getUsername())
                    .withExpiresAt(expiresAt)
                    // 使用了HMAC256加密算法。
                    .sign(Algorithm.HMAC256(TOKEN_SECRET_LOGIN_OUT));
            tokenMap.remove(user.getUsername());
        } catch (Exception e){
            e.printStackTrace();
        }
      //  return token;
        return tokenMap.get(user.getUsername());
    }

    /**
     * 签名验证
     * @param token
     * @return
     */
    public static boolean verify(String token){
        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(TOKEN_SECRET)).withIssuer("auth0").build();
            DecodedJWT jwt = verifier.verify(token);
            String oldToken = tokenMap.get(jwt.getClaim("username").asString());
            if(StringUtils.isBlank(oldToken)){
                tokenMap.put(jwt.getClaim("username").asString(),token);
            }
            if(!token.equals(oldToken)){
                return false;
            }
            System.out.println("认证通过：");
            System.out.println("username: " + jwt.getClaim("username").asString());
            System.out.println("过期时间：      " + jwt.getExpiresAt());
            return true;
        } catch (Exception e){
            return false;
        }
    }
}