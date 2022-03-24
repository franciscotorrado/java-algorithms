package algorithms;

import org.junit.jupiter.api.Test;
import org.pacotorrado.algorithms.RomanToInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {

    RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    void calculate_III() {
        String roman = "III";
        int expectedResult = 3;

        int result = romanToInteger.romanToInt(roman);

        assertEquals(expectedResult, result);
    }

    @Test
    void calculate_LVIII() {
        String roman = "LVIII";
        int expectedResult = 58;

        int result = romanToInteger.romanToInt(roman);

        assertEquals(expectedResult, result);
    }

    @Test
    void calculate_MCMXCIV() {
        String roman = "MCMXCIV";
        int expectedResult = 1994;

        int result = romanToInteger.romanToInt(roman);

        assertEquals(expectedResult, result);
    }

    @Test
    void calculate_XXXIII() {
        String roman = "XXXIII";
        int expectedResult = 33;

        int result = romanToInteger.romanToInt(roman);

        assertEquals(expectedResult, result);
    }

    @Test
    void calculate_XXXIV() {
        String roman = "XXXIV";
        int expectedResult = 34;

        int result = romanToInteger.romanToInt(roman);

        assertEquals(expectedResult, result);
    }

    @Test
    void calculate_CXXIX() {
        String roman = "CXXIX";
        int expectedResult = 129;

        int result = romanToInteger.romanToInt(roman);

        assertEquals(expectedResult, result);
    }
}
