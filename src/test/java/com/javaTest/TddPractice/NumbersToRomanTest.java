package com.javaTest.TddPractice;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersToRomanTest {
    NumbersToRoman translator = new NumbersToRoman();
    @Test
    public void romanWithoutSubtraction(){
        assertTrue(translator.numberToRoman(1,"").equalsIgnoreCase("I"));
        assertTrue(translator.numberToRoman(2,"").equalsIgnoreCase("II"));
        assertTrue(translator.numberToRoman(3,"").equalsIgnoreCase("III"));
        assertTrue(translator.numberToRoman(5,"").equalsIgnoreCase("V"));
        assertTrue(translator.numberToRoman(6,"").equalsIgnoreCase("VI"));
        assertTrue(translator.numberToRoman(7,"").equalsIgnoreCase("VII"));
        assertTrue(translator.numberToRoman(8,"").equalsIgnoreCase("VIII"));
        assertTrue(translator.numberToRoman(10,"").equalsIgnoreCase("X"));
        assertTrue(translator.numberToRoman(13,"").equalsIgnoreCase("XIII"));
        assertTrue(translator.numberToRoman(15,"").equalsIgnoreCase("XV"));
        assertTrue(translator.numberToRoman(17,"").equalsIgnoreCase("XVII"));
        assertTrue(translator.numberToRoman(20,"").equalsIgnoreCase("XX"));
        assertTrue(translator.numberToRoman(23,"").equalsIgnoreCase("XXIII"));
        assertTrue(translator.numberToRoman(25,"").equalsIgnoreCase("XXV"));
        assertTrue(translator.numberToRoman(28,"").equalsIgnoreCase("XXVIII"));
        assertTrue(translator.numberToRoman(50,"").equalsIgnoreCase("L"));
        assertTrue(translator.numberToRoman(53,"").equalsIgnoreCase("LIII"));
        assertTrue(translator.numberToRoman(56,"").equalsIgnoreCase("LVI"));
        assertTrue(translator.numberToRoman(60,"").equalsIgnoreCase("LX"));
        assertTrue(translator.numberToRoman(73,"").equalsIgnoreCase("LXXIII"));
        assertTrue(translator.numberToRoman(126,"").equalsIgnoreCase("CXXVI"));
        assertTrue(translator.numberToRoman(503,"").equalsIgnoreCase("DIII"));
        assertTrue(translator.numberToRoman(2507,"").equalsIgnoreCase("MMDVII"));
    }

    @Test
    public void romanWithSubtraction() {
        assertTrue(translator.numberToRoman(4,"").equalsIgnoreCase("IV"));
        assertTrue(translator.numberToRoman(9,"").equalsIgnoreCase("IX"));
        assertTrue(translator.numberToRoman(14,"").equalsIgnoreCase("XIV"));
        assertTrue(translator.numberToRoman(19,"").equalsIgnoreCase("XIX"));
        assertTrue(translator.numberToRoman(24,"").equalsIgnoreCase("XXIV"));
        assertTrue(translator.numberToRoman(40,"").equalsIgnoreCase("XL"));
        assertTrue(translator.numberToRoman(49,"").equalsIgnoreCase("XLIX"));
        assertTrue(translator.numberToRoman(90,"").equalsIgnoreCase("XC"));
        assertTrue(translator.numberToRoman(99,"").equalsIgnoreCase("XCIX"));
        assertTrue(translator.numberToRoman(400,"").equalsIgnoreCase("CD"));
        assertTrue(translator.numberToRoman(900,"").equalsIgnoreCase("CM"));
    }
}