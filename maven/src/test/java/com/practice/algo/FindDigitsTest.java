package com.practice.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindDigitsTest {

    @Test
    void test_with_zero() {
        assertEquals(3, FindDigits.findDigits(1012));
    }

    @Test
    void test_without_zero() {
        assertEquals(2, FindDigits.findDigits(12));
    }
}