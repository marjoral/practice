package com.practice.algo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxIntegerTest {

    @Test
    void test_small_integers() {
        List<Long> result = MinMaxInteger.computeMinMax(new int[]{1, 2, 3, 4, 5});

        assertEquals(2, result.size());
        assertEquals(Long.valueOf(10), result.get(0));
        assertEquals(Long.valueOf(14), result.get(1));
    }

    @Test
    void test_overflow_integers() {
        List<Long> result = MinMaxInteger.computeMinMax(new int[]{942381765, 627450398, 954173620, 583762094, 236817490});

        assertEquals(2, result.size());
        assertEquals(Long.valueOf(2390411747L), result.get(0));
        assertEquals(Long.valueOf(3107767877L), result.get(1));
    }
}