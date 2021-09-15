package com.practice.algo;

import java.util.List;

public class SubarrayDivision {

    /**
     * Given a list of integers, determine the number of adjacent combinations that sum to the desired value
     * @param s List of integers to be looped over
     * @param d Wanted sum value
     * @param m Number of adjacent elements to be summed together while looping over the list
     * @return
     */
    public static int birthday(List<Integer> s, int d, int m) {
        int result = 0;
        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += s.get(j);
            }
            if(sum == d){
                result++;
            }
        }
        return result;
    }
}
