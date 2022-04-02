package org.pacotorrado.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfStepsToReduceANumberToZeroTest {

    NumberOfStepsToReduceANumberToZero numberOfStepsToReduceANumberToZero = new NumberOfStepsToReduceANumberToZero();

    @Test
    void shouldReturn6For14() {
        int num = 14;
        int expectedOutput = 6;
        assertEquals(expectedOutput, numberOfStepsToReduceANumberToZero.numberOfSteps(num));
    }

    @Test
    void shouldReturn4For8() {
        int num = 8;
        int expectedOutput = 4;
        assertEquals(expectedOutput, numberOfStepsToReduceANumberToZero.numberOfSteps(num));
    }

    @Test
    void shouldReturn12For123() {
        int num = 123;
        int expectedOutput = 12;
        assertEquals(expectedOutput, numberOfStepsToReduceANumberToZero.numberOfSteps(num));
    }

}
