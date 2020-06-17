package com.practice.algo;

import java.util.Arrays;
import java.util.List;

public class MinMaxInteger {

    /**
     * Given an array of 5 int, calculate the min and max sum using 4 of the 5 int
     * @param array of 5 int
     * @return List containing two elements, min and max sum
     */
    public static List<Long> computeMinMax(int[] array){
        long max = Long.MIN_VALUE, min = Long.MAX_VALUE;

        for(int i = 0; i < array.length; i++){
            long sum = 0;
            for (int j = 0; j < array.length; j++) {
                if(i == j){
                    continue;
                }

                sum+= array[j];
            }

            if(sum > max){
                max = sum;
            }
            if(sum < min){
                min = sum;
            }
        }

        return Arrays.asList(min, max);
    }
}
