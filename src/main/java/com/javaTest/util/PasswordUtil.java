package com.javaTest.util;

public class PasswordUtil {
    //ALT+ENTER creates a test class
    public enum SecurityLevel{
        WEAK, MEDIUM, STRONG
    }

    public static SecurityLevel assessPassword(String password){
        if(password.length()<8){
            return SecurityLevel.WEAK;
        }
        // validate if the password only have letters
        if(password.matches("[a-zA-z]+")){
            return SecurityLevel.WEAK;
        }
        if(password.matches("[a-zA-z0-9]+")){
            return SecurityLevel.MEDIUM;
        }
        return SecurityLevel.STRONG;
    }
}
