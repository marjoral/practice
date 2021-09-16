package com.practice.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketPairsTest {

    @Test
    void test_example_one() {
        BracketPairs checker = new BracketPairs();
        assertTrue(checker.isValid("()"));
    }
    @Test
    void test_example_two() {
        BracketPairs checker = new BracketPairs();
        assertTrue(checker.isValid("()[]{}"));
    }
    @Test
    void test_example_three() {
        BracketPairs checker = new BracketPairs();
        assertFalse(checker.isValid("(]"));
    }
    @Test
    void test_example_four() {
        BracketPairs checker = new BracketPairs();
        assertFalse(checker.isValid("([)]"));
    }
    @Test
    void test_example_five() {
        BracketPairs checker = new BracketPairs();
        assertTrue(checker.isValid("{[]}"));
    }

    @Test
    void test_example_six() {
        BracketPairs checker = new BracketPairs();
        assertFalse(checker.isValid(")("));
    }
}