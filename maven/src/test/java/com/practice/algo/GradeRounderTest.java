package com.practice.algo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GradeRounderTest {

    @Test
    void test_grades_rounded() {
        List<Integer> roundedGrades = GradeRounder.round(Arrays.asList(4, 73, 67, 38, 33, 88));

        assertEquals(Arrays.asList(4, 75, 67, 40, 33, 90), roundedGrades);
    }
}