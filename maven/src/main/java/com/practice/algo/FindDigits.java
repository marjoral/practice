package com.practice.algo;

public class FindDigits {

    /**
     * Given a number determine how many of the digits within the number evenly divide into it
     * @param number the integer to be checked
     * @return the number of digits that evenly divided
     */
    public static int findDigits(int number){
        int result = 0;
        int copy = number;
        while(copy > 0){
            int remainder = copy % 10;
            if(remainder != 0) {
                if (number % remainder == 0) {
                    result++;
                }
            }
            copy = copy / 10;
        }

        return result;
    }
}
