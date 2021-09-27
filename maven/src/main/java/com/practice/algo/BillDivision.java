package com.practice.algo;

import java.util.List;

public class BillDivision {

    /**
     * Given a list of integers, an item to exclude, and a proposed shared split of the bill, sum together the items in the list
     * and split it between two people.
     * @param bill the list of items to sum together
     * @param excludeIndex the item to exclude from the sum
     * @param share the proposed share of the bill
     * @return Zero if the share is fair, otherwise return the difference between the proposed share and the actual share
     */
    public static int bonAppetit(List<Integer> bill, int excludeIndex, int share) {
        int total = 0;
        for (int i = 0; i < bill.size(); i++) {
            if(i == excludeIndex){
                continue;
            }
            total+= bill.get(i);
        }

        int split = total / 2;

        if(split == share) {
            return 0;
        }
        return share - split;
    }
}
