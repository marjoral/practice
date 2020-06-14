package com.practice.algo;

import java.util.Arrays;
import java.util.List;

public class TripletComparison {

    public static List<Integer> compareTriplet(List<Integer> firstList, List<Integer> secondList){
        if(firstList.size() != 3 || secondList.size() != 3){
            throw new IllegalStateException("Unable to compare lists as they do not meet the criteria");
        }
        int firstPoints = 0, secondPoints = 0;
        for(int i = 0; i < firstList.size(); i++){
            if(firstList.get(i) > secondList.get(i)){
                firstPoints++;
            }else if(firstList.get(i) < secondList.get(i)){
                secondPoints++;
            }
        }

        return Arrays.asList(firstPoints, secondPoints);
    }
}
