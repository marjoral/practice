package com.practice.algo;

public class JumpingOnClouds {

    static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;

        for (int i = 0; i < c.length;) {
            i += k;
            energy--;

            if(i >= c.length){
                i = i % c.length;
                if(c[i] == 1){
                    energy -= 2;
                }
                break;
            }

            if(c[i] == 1){
                energy -= 2;
            }
        }

        return energy;
    }
}
