package com.practice.algo;

public class Kangaroo {

    public static String willTouchEventually(int x1, int v1, int x2, int v2) {
        if(x1 == x2) {
            return "YES";
        }else if(x1 > x2 && v1 >= v2){
            return "NO";
        }else if(x1 < x2 && v1 <= v2){
            return "NO";
        }
        return willTouchEventually(x1+v1, v1, x2+v2, v2);
    }
}
