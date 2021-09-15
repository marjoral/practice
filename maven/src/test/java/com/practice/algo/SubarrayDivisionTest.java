package com.practice.algo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubarrayDivisionTest {

    @Test
    void test_single_element() {
        assertEquals(SubarrayDivision.birthday(Collections.singletonList(4), 4, 1), 1);
    }

    @Test
    void test_several_element() {
        assertEquals(SubarrayDivision.birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2), 2);
    }

    @Test
    void test_zero_matches() {
        assertEquals(SubarrayDivision.birthday(Arrays.asList(1, 1, 1, 1, 1, 1), 3, 2), 0);
    }
}