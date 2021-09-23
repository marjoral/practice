package com.practice.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaveThePrisonerTest {

    @Test
    void test() {
        assertEquals(SaveThePrisoner.saveThePrisonerFaster(5, 2, 2), 3);
    }

    @Test
    void test_2() {
        assertEquals(SaveThePrisoner.saveThePrisonerFaster(7, 19, 2), 6);
    }

    @Test
    void test_3() {
        assertEquals(SaveThePrisoner.saveThePrisonerFaster(2 ,739424390, 2), 1);
    }

}