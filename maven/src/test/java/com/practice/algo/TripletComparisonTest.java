package com.practice.algo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TripletComparisonTest {

    @Test
    void test_illegal_list_one_size_throws_exception() {
        assertThrows(IllegalStateException.class, () -> TripletComparison.compareTriplet(Arrays.asList(1), Arrays.asList(2)));
    }

    @Test
    void test_illegal_list_two_size_throws_exception() {
        assertThrows(IllegalStateException.class, () -> TripletComparison.compareTriplet(Arrays.asList(1,2,3), Arrays.asList(2)));
    }

    @Test
    void test_matching_values_returns_draw() {
        List<Integer> results = TripletComparison.compareTriplet(Arrays.asList(1, 2, 3), Arrays.asList(1,2,3));

        assertEquals(2, results.size());
        assertEquals(Arrays.asList(0,0), results);
    }

    @Test
    void test_list_one_beats_list_two() {
        List<Integer> results = TripletComparison.compareTriplet(Arrays.asList(1, 2, 3), Arrays.asList(1,1,1));

        assertEquals(2, results.size());
        assertEquals(Arrays.asList(2,0), results);
    }

    @Test
    void test_list_two_beats_list_one() {
        List<Integer> results = TripletComparison.compareTriplet(Arrays.asList(1, 1, 1), Arrays.asList(1,2,3));

        assertEquals(2, results.size());
        assertEquals(Arrays.asList(0,2), results);
    }
}