package com.practice.algo;

import java.util.Arrays;

public class VeryBigSum {

    public static long aVeryBigSum(long[] ar) {
        return Arrays.stream(ar).sum();
    }
}
