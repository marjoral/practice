package com.practice.algo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BillDivisionTest {

    @Test
    void test_fair_split() {
        assertEquals(0, BillDivision.bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 7));
    }


    @Test
    void test_unfair_split() {
        assertEquals(5, BillDivision.bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 12));
    }
}