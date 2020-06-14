package com.practice.algo;

import java.util.Arrays;

public class SimpleArraySum {

    /**
     * Method to sum an array of ints using a for loop
     * @param array ints to be summed
     * @return summed contents of array
     */
    public static int sumArray(int[] array){
        int sum = 0;
        if(array != null){
            for (int i : array) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Method to sum an array of ints using streams
     * @param array ints to be summed
     * @return summed contents of array
     */
    public static int sumArrayStream(int[] array){
        if(array == null){
            return 0;
        }
        return Arrays.stream(array).sum();
    }

}
