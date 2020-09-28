package com.fanruan.platform.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util
{
	private static Logger log = LoggerFactory.getLogger(MD5Util.class);
    public final static String MD5(String s)
    {
        char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        try
        {
            byte[] btInput = s.getBytes();
            
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            
            mdInst.update(btInput);
            
            byte[] md = mdInst.digest();
            
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++)
            {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        }
        catch (Exception e)
        {
        	log.error("MD5 Exception",e);
            return null;
        }
    }

    public static final String Md(String plainText, boolean judgeMD) {
        StringBuffer buf = new StringBuffer("");
        try {   
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(plainText.getBytes());   
        byte b[] = md.digest();   
        int i;   
        for (int offset = 0; offset < b.length; offset++) {   
            i = b[offset];   
            if(i<0) i+= 256;   
            if(i<16)   
            buf.append("0");   
            buf.append(Integer.toHexString(i));
        }   
  
        } catch (NoSuchAlgorithmException e) {
        	log.error("MD5 EROOR",e);
        }   
        if(judgeMD == true){  
            return buf.toString();  
        }else{  
            return buf.toString().substring(8,24);  
        }  
          
    } 
    
    public static void main(String[] args)
    {
    System.out.println(MD5("李民").toUpperCase());
    }
}