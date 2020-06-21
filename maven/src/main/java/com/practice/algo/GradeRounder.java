package com.practice.algo;

import java.util.ArrayList;
import java.util.List;

public class GradeRounder {

    public static List<Integer> round(List<Integer> grades){
        List<Integer> roundedGrades = new ArrayList<>(grades.size());
        for(Integer grade : grades){
            if(grade < 40){
                if(grade > 37){
                    roundedGrades.add(40);
                }else{
                    roundedGrades.add(grade);
                }
            } else if(grade % 5 == 4){
                roundedGrades.add(grade + 1);
            } else if(grade % 5 == 3){
                roundedGrades.add(grade + 2);
            } else {
                roundedGrades.add(grade);
            }
        }

        return roundedGrades;
    }
}
