package com.practice.algo;


import java.util.ArrayList;
import java.util.List;

/**
 * Given a string containing  '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * 	1. Open brackets must be closed by the same type of brackets.
 * 	2. Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 */

public class BracketPairs {

    public boolean isValid(String stringToCheck){
        if(stringToCheck.isEmpty()){
            return true;
        }

        List<Character> brackets = new ArrayList<>();
        for (int i = 0; i < stringToCheck.length(); i++) {
            char character = stringToCheck.charAt(i);
            switch (character) {
                case '(', '{', '[' -> brackets.add(character);
                case ')' -> {
                    if(!checkStack(brackets, '(')){
                        return false;
                    }
                }
                case '}' -> {
                    if(!checkStack(brackets, '{')){
                        return false;
                    }
                }
                case ']' -> {
                    if(!checkStack(brackets, '[')){
                        return false;
                    }
                }
            }
        }

        if(!brackets.isEmpty()){
            return false;
        }

        return true;
    }

    private boolean checkStack(List<Character> brackets, char expectedMatchingType){
        if(brackets.isEmpty()){
            return false;
        }
        Character leftBracket = brackets.remove(brackets.size() - 1);
        return expectedMatchingType == leftBracket;
    }


}
