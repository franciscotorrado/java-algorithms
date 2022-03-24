package org.pacotorrado.algorithms;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {
        Map<Character, Integer> letters = new HashMap<>();
        letters.put('I', 1);
        letters.put('V', 5);
        letters.put('X', 10);
        letters.put('L', 50);
        letters.put('C', 100);
        letters.put('D', 500);
        letters.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            final int nextValue = letters.get(s.charAt(i));
            if (i < s.length() - 1 && nextValue < letters.get(s.charAt(i + 1))) {
                result -= nextValue;
            } else {
                result += nextValue;
            }
        }

        return result;
    }
}
