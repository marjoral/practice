package com.practice.algo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalDifferenceTest {

    @Test
    void test_compute_difference_returns_zero_when_diagonals_match() {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Collections.singletonList(3));
        matrix.add(Arrays.asList(1,1,1));
        matrix.add(Arrays.asList(1,1,1));
        matrix.add(Arrays.asList(1,1,1));

        int difference = DiagonalDifference.computeDifference(matrix);

        assertEquals(0, difference);
    }

    @Test
    void test_compute_difference_returns_sum_when_diagonals_differ() {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Collections.singletonList(3));
        matrix.add(Arrays.asList(11,2,4));
        matrix.add(Arrays.asList(4,5,6));
        matrix.add(Arrays.asList(10,8,-12));

        int difference = DiagonalDifference.computeDifference(matrix);

        assertEquals(15, difference);
    }

    @Test
    void test_compute_difference_returns_zero_with_single_element_matrix() {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Collections.singletonList(1));
        matrix.add(Collections.singletonList(1));

        int difference = DiagonalDifference.computeDifference(matrix);

        assertEquals(0, difference);
    }

    @Test
    void test_compute_difference_returns_difference_with_two_by_two_matrix() {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Collections.singletonList(2));
        matrix.add(Arrays.asList(1,1));
        matrix.add(Arrays.asList(1,2));

        int difference = DiagonalDifference.computeDifference(matrix);

        assertEquals(1, difference);
    }
}