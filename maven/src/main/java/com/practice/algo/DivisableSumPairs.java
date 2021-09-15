package com.practice.algo;

import java.util.List;

public class DivisableSumPairs {

    /**
     * Given a list of integers, determine the number of combinations that are evenly divisible by 'k'
     * @param divisor the integer to divide by
     * @param integers the list of integers
     * @return the number of evenly divisible pairs in the list
     */
    public static int check(int divisor, List<Integer> integers) {
        int result = 0;

        for (int i = 0; i < integers.size() - 1; i++) {
            for (int j = i + 1; j < integers.size(); j++) {
                int sum = integers.get(i) + integers.get(j);
                if (sum % divisor == 0) {
                    result++;
                }
            }
        }

        return result;
    }
}
