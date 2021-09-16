package com.practice.algo;

public class SaveThePrisoner {
    /**
     * Brute force, obvious performance issues.
     * @param n the number of prisoners
     * @param m the number of sweets
     * @param s the number to start passing out treats at
     * @return the number representing the last prisoner to receive a sweet
     */
    public static int saveThePrisoner(int n, int m, int s) {
        if(m == 1){
            return s;
        }

        if(m > n){
            m = m % n;

            if(m == 0){
                s--;
                if(s == 0){
                    s = n;
                }
            }
        }

        int currentPrisoner = s;
        for (m--; m > 0; m--) {
            currentPrisoner++;

            if(currentPrisoner > n){
                currentPrisoner = 1;
            }
        }

        return currentPrisoner;
    }
}
