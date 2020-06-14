package com.practice.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleArraySumTest {

    @Test
    void test_given_null_array_sum_returns_zero() {
        int sum = SimpleArraySum.sumArray(null);

        assertEquals(0, sum);
    }

    @Test
    void test_given_empty_array_sum_returns_zero() {
        int[] array = {};
        int sum = SimpleArraySum.sumArray(array);

        assertEquals(0, sum);
    }

    @Test
    void test_given_populated_array_sum_returns_correct_sum() {
        int[] array = {1,2,3};
        int sum = SimpleArraySum.sumArray(array);

        assertEquals(6, sum);
    }

    @Test
    void test_given_populated_negative_array_sum_returns_correct_sum() {
        int[] array = {-1,-2,-3};
        int sum = SimpleArraySum.sumArray(array);

        assertEquals(-6, sum);
    }

    @Test
    void test_given_null_array_sum_stream_returns_zero() {
        int sum = SimpleArraySum.sumArrayStream(null);

        assertEquals(0, sum);
    }

    @Test
    void test_given_empty_array_sum_stream_returns_zero() {
        int[] array = {};
        int sum = SimpleArraySum.sumArrayStream(array);

        assertEquals(0, sum);
    }

    @Test
    void test_given_populated_array_sum_stream_returns_correct_sum() {
        int[] array = {1,2,3};
        int sum = SimpleArraySum.sumArrayStream(array);

        assertEquals(6, sum);
    }

    @Test
    void test_given_populated_negative_array_sum_stream_returns_correct_sum() {
        int[] array = {-1,-2,-3};
        int sum = SimpleArraySum.sumArrayStream(array);

        assertEquals(-6, sum);
    }
}