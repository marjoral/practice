package com.practice.algo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RightArrayRotationTest {

    @Test
    void test_rotations() {
        List<Integer> array = Arrays.asList(1, 2, 3);
        List<Integer> queries = Arrays.asList(0, 1, 2);
        assertEquals(Arrays.asList(2, 3, 1), RightArrayRotation.rightArrayRotation(array, 2, queries));
    }
}