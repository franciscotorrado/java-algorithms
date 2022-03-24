package org.pacotorrado.algorithms;

public class RomanToInteger {

    public int romanToInt(String s) {
        int total = 0;
        String[] splitString = s.split("");
        Letters lastLetter = null;
        for (String nextLetter : splitString) {
            final Letters letter = Letters.valueOf(nextLetter);
            if (lastLetter != null && (lastLetter.getValue() < letter.getValue())) {
                total = total - 2 * lastLetter.getValue() + letter.getValue();
            } else {
                total += letter.getValue();
                lastLetter = letter;
            }
        }
        return total;
    }

    enum Letters {
        I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

        private final int value;

        Letters(final int value) {
            this.value = value;
        }

        int getValue() {
            return value;
        }
    }
}
