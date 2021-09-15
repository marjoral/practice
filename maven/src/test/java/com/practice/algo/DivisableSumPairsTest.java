package com.practice.algo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DivisableSumPairsTest {

    @Test
    void test_sum_pairs() {
        assertEquals(DivisableSumPairs.check(3, Arrays.asList(1, 3, 2, 6, 1, 2)), 5);
    }
}