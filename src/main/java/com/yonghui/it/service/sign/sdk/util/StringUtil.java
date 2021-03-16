package com.yonghui.it.service.sign.sdk.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.util.UUID;

public class StringUtil {
    private static final Logger log = LoggerFactory.getLogger(StringUtil.class);
    public static final int INDEX_NOT_FOUND = -1;
    public static final String EMPTY = "";
    public static final String CHARSET = "UTF-8";
    public  static String toString(byte[] bytes){
        try {
            return new String(bytes,CHARSET);
        } catch (UnsupportedEncodingException e) {
            log.error("UnsupportedEncodingException",e);
            return null;
        }
    }
    public static boolean isBlank(final CharSequence cs) {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (Character.isWhitespace(cs.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }
    public static String uuid() {
        String uuid = UUID.randomUUID().toString();
        return remove(uuid, "-");
    }
    public static String StrList(Integer[] strs, String split) {
        if(null==strs||strs.length==0){
            return "";
        }
        StringBuffer fullStr = new StringBuffer();
        for (Integer str : strs) {
            fullStr.append(str).append(split);
        }
        return fullStr.substring(0, fullStr.length()-split.length());
    }



    public static String remove(final String str, final String remove) {
        if (isEmpty(str) || isEmpty(remove)) {
            return str;
        }
        return replace(str, remove, EMPTY, -1);
    }
    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }
    public static String replace(final String text, final String searchString, final String replacement, int max) {
        if (isEmpty(text) || isEmpty(searchString) || replacement == null || max == 0) {
            return text;
        }
        int start = 0;
        int end = text.indexOf(searchString, start);
        if (end == INDEX_NOT_FOUND) {
            return text;
        }
        final int replLength = searchString.length();
        int increase = replacement.length() - replLength;
        increase = increase < 0 ? 0 : increase;
        increase *= max < 0 ? 16 : max > 64 ? 64 : max;
        final StringBuilder buf = new StringBuilder(text.length() + increase);
        while (end != INDEX_NOT_FOUND) {
            buf.append(text.substring(start, end)).append(replacement);
            start = end + replLength;
            if (--max == 0) {
                break;
            }
            end = text.indexOf(searchString, start);
        }
        buf.append(text.substring(start));
        return buf.toString();
    }
}
