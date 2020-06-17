package com.practice.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TallestCandleTest {

    @Test
    void test_tallest_candle_last() {
        int extinguishedCandles = TallestCandle.calculateExtinguishedCandles(new int[]{1, 2, 3});

        assertEquals(1, extinguishedCandles);
    }

    @Test
    void test_tallest_candle_first() {
        int extinguishedCandles = TallestCandle.calculateExtinguishedCandles(new int[]{3, 2, 1});

        assertEquals(1, extinguishedCandles);
    }

    @Test
    void test_multiple_candles() {
        int extinguishedCandles = TallestCandle.calculateExtinguishedCandles(new int[]{3, 1, 2, 3});

        assertEquals(2, extinguishedCandles);
    }
}