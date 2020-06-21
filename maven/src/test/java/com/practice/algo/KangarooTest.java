package com.practice.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KangarooTest {

    @Test
    void test_kangaroos_will_touch() {
        assertEquals("YES", Kangaroo.willTouchEventually(0, 3, 4, 2));
    }

    @Test
    void test_roo_one_outpaces_roo_two() {
        assertEquals("NO", Kangaroo.willTouchEventually(0, 3, 5, 1));
    }

    @Test
    void test_roo_one_already_ahead_of_roo_two() {
        assertEquals("NO", Kangaroo.willTouchEventually(4, 3, 3, 2));
    }

    @Test
    void test_roo_two_outpaces_roo_one() {
        assertEquals("NO", Kangaroo.willTouchEventually(2, 2, 0, 6));
    }

    @Test
    void test_roo_two_already_ahead_of_roo_one() {
        assertEquals("NO", Kangaroo.willTouchEventually(0, 2, 4, 5));
    }

    @Test
    void test_kangaroos_already_touching() {
        assertEquals("YES", Kangaroo.willTouchEventually(0, 3, 0, 2));
    }
}