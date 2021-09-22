package com.practice.algo;

import java.util.ArrayList;
import java.util.List;

public class RightArrayRotation {

    /**
     * Function to calculate the position of integers in an array after a number of right rotations
     * @param listIntegers The list to rotate
     * @param rotations The number of rotations to perform
     * @param queries The list of indices to query with after rotating
     * @return List of integers at the query indices
     */
    public static List<Integer> rightArrayRotation(List<Integer> listIntegers, int rotations, List<Integer> queries) {
        List<Integer> result = new ArrayList<>();

        int totalRotations = rotations;
        if(rotations > listIntegers.size()){
            totalRotations = rotations % listIntegers.size();
        }

        for (Integer index : queries) {
            if(totalRotations > index){
                result.add(listIntegers.get(listIntegers.size() - (totalRotations - index)));
            } else {
                result.add(listIntegers.get(index - totalRotations));
            }
        }

        return result;
    }
}