package com.practice.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BreakingRecordsTest {

    @Test
    void test_broken_high_score() {
        int[] brokenRecords = BreakingRecords.getBrokenRecords(new int[]{1,2,3});

        assertEquals(2, brokenRecords.length);
        assertEquals(2, brokenRecords[0]);
        assertEquals(0, brokenRecords[1]);
    }

    @Test
    void test_broken_low_score() {
        int[] brokenRecords = BreakingRecords.getBrokenRecords(new int[]{3,2,-1});

        assertEquals(2, brokenRecords.length);
        assertEquals(0, brokenRecords[0]);
        assertEquals(2, brokenRecords[1]);
    }

    @Test
    void test_never_broke_a_record() {
        int[] brokenRecords = BreakingRecords.getBrokenRecords(new int[]{3,3,3});

        assertEquals(2, brokenRecords.length);
        assertEquals(0, brokenRecords[0]);
        assertEquals(0, brokenRecords[1]);
    }
}