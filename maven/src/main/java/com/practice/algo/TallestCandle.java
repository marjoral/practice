package com.practice.algo;

import java.util.HashMap;
import java.util.Map;

public class TallestCandle {

    /**
     * Given an array of integers that represent the heights of candles.
     * Determine how many candles can be blown out. Only the tallest candles in the array will be extinguished.
     * @param array of integers
     * @return the number of candles extinguished
     */
    public static int calculateExtinguishedCandles(int[] array){
        Map<Integer, Integer> runningTotals = new HashMap<>();
        int tallestCandle = 0;

        for (int candle : array) {
            if (candle > tallestCandle) {
                tallestCandle = candle;
            }

            if (candle == tallestCandle) {
                Integer counter = runningTotals.get(tallestCandle);
                if (counter == null) {
                    runningTotals.put(tallestCandle, 1);
                } else {
                    runningTotals.put(tallestCandle, ++counter);
                }
            }
        }

        return runningTotals.get(tallestCandle);
    }
}
