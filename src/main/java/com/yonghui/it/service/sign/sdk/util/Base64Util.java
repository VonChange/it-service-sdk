package com.yonghui.it.service.sign.sdk.util;

import org.apache.commons.codec.binary.Base64;


public class Base64Util {
     public  static String toBase64(byte[] bytes){
         return  Base64.encodeBase64String(bytes);
     }
    public  static String encode(byte[] bytes){
        return Base64.encodeBase64String(bytes);
    }
    public static  byte[] decode(String data){
        return Base64.decodeBase64(data);
    }

}
