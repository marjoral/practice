package com.practice.algo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntegerArrayRatiosTest {

    @Test
    void test_even_distribution() {
        List<Double> ratios = IntegerArrayRatios.calculateRatios(new int[]{1, 0, -1});

        assertEquals(0.333, ratios.get(0), 0.01);
        assertEquals(0.333, ratios.get(1), 0.01);
        assertEquals(0.333, ratios.get(2), 0.01);
    }

    @Test
    void test_positive_majority() {
        List<Double> ratios = IntegerArrayRatios.calculateRatios(new int[]{1, 0, -1, 13, 15, 5, 0, -5});

        assertEquals(0.50, ratios.get(0), 0.00);
        assertEquals(0.25, ratios.get(1), 0.00);
        assertEquals(0.25, ratios.get(2), 0.00);
    }

    @Test
    void test_zero_majority() {
        List<Double> ratios = IntegerArrayRatios.calculateRatios(new int[]{1, 0, 0, 0, -1});

        assertEquals(0.20, ratios.get(0), 0.00);
        assertEquals(0.20, ratios.get(1), 0.00);
        assertEquals(0.60, ratios.get(2), 0.00);
    }

    @Test
    void test_negative_majority() {
        List<Double> ratios = IntegerArrayRatios.calculateRatios(new int[]{1, 0, -1, -2, -14, 16, -18, -100});

        assertEquals(0.25, ratios.get(0), 0.00);
        assertEquals(0.625, ratios.get(1), 0.000);
        assertEquals(0.125, ratios.get(2), 0.000);
    }
}