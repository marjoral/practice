package com.practice.algo;

import java.util.ArrayList;
import java.util.List;

public class Staircase {

    /**
     * Builds a right-aligned 2D grid of '#' indicating a staircase, the max width and height are based on n, all remaining points are filled with whitespace.
     * @param n the max height of the staircase
     * @return a 2D grid containing the staircase
     */
    public static List<List<String>> buildStaircase(int n){
        List<List<String>> staircase = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            List<String> row = new ArrayList<>();
            addChar(n-i, " ", row);
            addChar(i, "#", row);
            staircase.add(row);
        }

        return staircase;
    }

    public static List<List<String>> buildStaircaseAlt(int n){
        List<List<String>> staircase = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            List<String> row = new ArrayList<>();
            int emptySpace = n - i;
            for (int j = 0; j < n; j++) {
                if(emptySpace > 0){
                    row.add(" ");
                    emptySpace--;
                }else{
                    row.add("#");
                }
            }
            staircase.add(row);
        }

        return staircase;
    }

    private static void addChar(int numberOfChar, String character, List<String> row) {
        for(int i = 0; i < numberOfChar; i++){
            row.add(character);
        }
    }
}
