package com.javaTest.util;

public class StringUtil {

    public static boolean isEmpty(String word){
        if(word == null){
            return true;
        }
        String wordWithNoBlanks = word.replaceAll("\\s","");
        return wordWithNoBlanks.length() < 1;
    }
}
