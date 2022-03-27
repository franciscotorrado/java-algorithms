package org.pacotorrado.algorithms;

import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        String[] values = new String[n];
        for (int i = 0, j = 1; i < n; i++, j++) {
            if (j % 15 == 0) {
                values[i] = "FizzBuzz";
            } else if (j % 3 == 0) {
                values[i] = "Fizz";
            } else if (j % 5 == 0) {
                values[i] = "Buzz";
            } else {
                values[i] = Integer.toString(j);
            }
        }
        return List.of(values);
    }
}
