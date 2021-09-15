package com.practice.algo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {

    /**
     * Given a list of integers, determine the highest frequency of a given integer. In the case of equal frequencies, the lower number is returned.
     * @param arr the list of integers to iterate over
     * @return the number with the highest frequency in the list
     */
    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> birdTypeByFreq = new HashMap<>();
        for (Integer bird : arr) {
            Integer frequency = birdTypeByFreq.get(bird);
            if(frequency == null){
                frequency = 1;
            }
            frequency = frequency + 1;
            birdTypeByFreq.put(bird, frequency);
        }

        int result = 0;
        int largestSize = 0;
        for (Map.Entry<Integer, Integer> entry : birdTypeByFreq.entrySet()) {
            if(entry.getValue() > largestSize){
                result = entry.getKey();
                largestSize = entry.getValue();
            }
        }

        return result;
    }
}
