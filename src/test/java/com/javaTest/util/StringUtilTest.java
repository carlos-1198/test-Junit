package com.javaTest.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {
    @Test
    public void emptyByZeroLength(){
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void emptyByNull(){
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void emptyByDoubleSpace(){
        assertTrue(StringUtil.isEmpty("  "));
    }

    @Test
    public void emptyByMultipleSpaces(){
        assertTrue(StringUtil.isEmpty("        "));
    }

    @Test
    public void notEmpty(){
        assertFalse(StringUtil.isEmpty("h"));
    }

    @Test
    public void notEmptyWithBlanks(){
        assertFalse(StringUtil.isEmpty("  5  "));
    }
}