package com.practice.algo;

import java.util.Arrays;
import java.util.List;

public class IntegerArrayRatios {

    /**
     * Given an array of positive, negative, and zero integers, calculate the number of occurrences of each as a ratio
     * @param array of positive, negative, and zero integers
     * @return {@link List} containing the ratios for positive, negative, and zero in that order
     */
    public static List<Double> calculateRatios(int[] array){
        double positive = 0, negative = 0, zero = 0;

        for (int current : array) {
            if (current > 0) {
                positive++;
            } else if (current < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        return Arrays.asList(positive/array.length, negative/array.length, zero/array.length);
    }
}
