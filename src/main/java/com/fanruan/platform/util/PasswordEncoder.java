package com.fanruan.platform.util;

import java.security.MessageDigest;

public class PasswordEncoder {

private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5",
"6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

private static String salt = "fTVaQfssWj9JWnB4wY4zNU4lCn9Esqwi";
private static String algorithm = "SHA";

//public PasswordEncoder(Object salt, String algorithm) {
//this.salt = salt;
//this.algorithm = algorithm;
//}

public static String encode(String rawPass) {
String result = null;
try {
MessageDigest md = MessageDigest.getInstance(algorithm);
//加密后的字符串
result = byteArrayToHexString(md.digest(mergePasswordAndSalt(rawPass).getBytes("utf-8")));
} catch (Exception ex) {
}
return result;
}

public static boolean isPasswordValid(String encPass, String rawPass) {
String pass1 = "" + encPass;
String pass2 = encode(rawPass);

return pass1.equals(pass2);
}

private static String mergePasswordAndSalt(String password) {
if (password == null) {
password = "";
}

if ((salt == null) || "".equals(salt)) {
return password;
} else {
return password + "{" + salt.toString() + "}";
}
}

/**
* 转换字节数组为16进制字串
* @param b 字节数组
* @return 16进制字串
*/
private static String byteArrayToHexString(byte[] b) {
StringBuffer resultSb = new StringBuffer();
for (int i = 0; i < b.length; i++) {
resultSb.append(byteToHexString(b[i]));
}
return resultSb.toString();
}

private static String byteToHexString(byte b) {
int n = b;
if (n < 0)
n = 256 + n;
int d1 = n / 16;
int d2 = n % 16;
return hexDigits[d1] + hexDigits[d2];
}

public static void main(String[] args) {
    String encode = PasswordEncoder.encode("credit_service_token");
    System.out.println(encode);
//String salt = "fTVaQfssWj9JWnB4wY4zNU4lCn9Esqwi";
//PasswordEncoder encoderMd5 = new PasswordEncoder(salt, "MD5");
//String encode = encoderMd5.encode("skip_login");
//System.out.println(encode);
//boolean passwordValid = encoderMd5.isPasswordValid("be19f820c76df3e920f95a7d0a9a889b", "skip_login");
//System.out.println(passwordValid);
//
//PasswordEncoder encoderSha = new PasswordEncoder(salt, "SHA");
//String pass2 = encoderSha.encode("skip_login");
//System.out.println(pass2);
//boolean passwordValid2 = encoderSha.isPasswordValid("f00a486b077e11cda492d17167b3397445f5884b", "skip_login");
//System.out.println(passwordValid2);
}

}