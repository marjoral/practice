package com.practice.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeConversionTest {

    @Test
    void test_am_cases() {
        assertEquals("00:00:00", TimeConversion.convertToTwentyFourHourFormat("12:00:00AM"));
        assertEquals("00:00:00", TimeConversion.convertToTwentyFourHourFormat("00:00:00AM"));
        assertEquals("01:00:00", TimeConversion.convertToTwentyFourHourFormat("01:00:00AM"));
    }

    @Test
    void test_pm_cases() {
        assertEquals("12:00:00", TimeConversion.convertToTwentyFourHourFormat("12:00:00PM"));
        assertEquals("13:00:00", TimeConversion.convertToTwentyFourHourFormat("01:00:00PM"));
    }
}