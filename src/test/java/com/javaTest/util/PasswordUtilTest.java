package com.javaTest.util;

import com.javaTest.util.PasswordUtil;
import org.junit.Test;

import static com.javaTest.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {
    //the password is weak if has less than 8 characters
    @Test
    public void weakPerSize(){
        assertEquals(WEAK, PasswordUtil.assessPassword("1asda&"));
    }
    //the password is weak if has only letters among its characters
    @Test
    public void weakPerOnlyLetters(){
        assertEquals(WEAK,PasswordUtil.assessPassword("abcdefghi"));
    }
    //the password is weak if has only letters among its characters
    @Test
    public void mediumPerLettersAndNumbers(){
        assertEquals(MEDIUM,PasswordUtil.assessPassword("a23rwa69"));
    }
    //the password is weak if has only letters among its characters
    @Test
    public void strongPerSizeAndContent(){
        assertEquals(STRONG,PasswordUtil.assessPassword("a23rw&a69%"));
    }
}