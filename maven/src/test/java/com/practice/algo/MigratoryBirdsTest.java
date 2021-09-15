package com.practice.algo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MigratoryBirdsTest {

    @Test
    void test_migratory_birds() {
        assertEquals(MigratoryBirds.migratoryBirds(Arrays.asList(1, 4, 4, 4, 5, 3)), 4);
    }

    @Test
    void test_two_groups_equal_in_quantity() {
        assertEquals(MigratoryBirds.migratoryBirds(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)), 3);
    }
}