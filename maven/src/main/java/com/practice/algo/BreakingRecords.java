package com.practice.algo;

public class BreakingRecords {

    /**
     * Given an array of scores for a season, calculate how many times the lowest and highest score records were broken
     * @param scores an array of integers
     * @return an array of size 2, the first element containing the number of broken highest records, and the second containing the number of broken lowest records
     */
    public static int[] getBrokenRecords(int[] scores){
        int lowest = scores[0], highest = scores[0];
        int brokeLowest = 0, brokeHighest = 0;

        for(int i = 1; i < scores.length; i++){
            int latestScore = scores[i];
            if(latestScore > highest){
                highest = latestScore;
                brokeHighest++;
            }else if(latestScore < lowest){
                lowest = latestScore;
                brokeLowest++;
            }
        }

        return new int[]{brokeHighest, brokeLowest};
    }
}
