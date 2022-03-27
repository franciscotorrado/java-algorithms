package org.pacotorrado.algorithms;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void shouldReturnValidValueFor3() {
        int n = 3;
        List<String> result = List.of("1", "2", "Fizz");
        assertEquals(result, fizzBuzz.fizzBuzz(n));
    }

    @Test
    void shouldReturnValidValueFor5() {
        int n = 5;
        List<String> result = List.of("1", "2", "Fizz", "4", "Buzz");
        assertEquals(result, fizzBuzz.fizzBuzz(n));
    }

    @Test
    void shouldReturnValidValueFor15() {
        int n = 15;
        List<String> result = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        assertEquals(result, fizzBuzz.fizzBuzz(n));
    }
}
