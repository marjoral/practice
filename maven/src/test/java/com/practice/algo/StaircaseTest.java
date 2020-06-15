package com.practice.algo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StaircaseTest {

    @Test
    void test_staircase() {
        List<List<String>> staircase = Staircase.buildStaircase(5);

        assertEquals(5, staircase.size());
        assertEquals(Arrays.asList(" ", " ", " ", " ", "#"), staircase.get(0));
        assertEquals(Arrays.asList(" ", " ", " ", "#", "#"), staircase.get(1));
        assertEquals(Arrays.asList(" ", " ", "#", "#", "#"), staircase.get(2));
        assertEquals(Arrays.asList(" ", "#", "#", "#", "#"), staircase.get(3));
        assertEquals(Arrays.asList("#", "#", "#", "#", "#"), staircase.get(4));
    }

    @Test
    void test_staircase_alternate() {
        List<List<String>> staircase = Staircase.buildStaircaseAlt(5);

        assertEquals(5, staircase.size());
        assertEquals(Arrays.asList(" ", " ", " ", " ", "#"), staircase.get(0));
        assertEquals(Arrays.asList(" ", " ", " ", "#", "#"), staircase.get(1));
        assertEquals(Arrays.asList(" ", " ", "#", "#", "#"), staircase.get(2));
        assertEquals(Arrays.asList(" ", "#", "#", "#", "#"), staircase.get(3));
        assertEquals(Arrays.asList("#", "#", "#", "#", "#"), staircase.get(4));
    }
}