package com.practice.algo;

import java.util.List;

public class DiagonalDifference {

    /**
     * Given a 2D list of integers compute the difference between the summed diagonals.
     * @param matrix 2 dimensional grid of integers
     * @return the difference of the summed diagonals
     */
    public static int computeDifference(List<List<Integer>> matrix) {
        int leftRight = 0, rightLeft = 0;
        for (int leftRightIndex = 0, rightLeftIndex = matrix.size() -1; leftRightIndex < matrix.size(); leftRightIndex++, rightLeftIndex--) {
            var row = matrix.get(leftRightIndex);

            leftRight += row.get(leftRightIndex);
            rightLeft += row.get(rightLeftIndex);
        }

        return Math.abs(leftRight - rightLeft);
    }
}
