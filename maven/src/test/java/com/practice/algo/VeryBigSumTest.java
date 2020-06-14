package com.practice.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeryBigSumTest {

    @Test
    void test_long_returns_bigger_value_than_int() {
        long[] array = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        long bigSum = VeryBigSum.aVeryBigSum(array);

        assertEquals(4294967294L, bigSum);
    }
}