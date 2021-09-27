package com.practice.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpingOnCloudsTest {

    @Test
    void test() {
        assertEquals(92, JumpingOnClouds.jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2));
    }

    @Test
    void test_2() {
        assertEquals(94, JumpingOnClouds.jumpingOnClouds(new int[]{1, 1, 1, 0, 1, 1, 0, 0, 0, 0}, 3));
    }
}