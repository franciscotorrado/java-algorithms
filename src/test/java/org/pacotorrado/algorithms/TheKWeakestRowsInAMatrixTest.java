package org.pacotorrado.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TheKWeakestRowsInAMatrixTest {
    TheKWeakestRowsInAMatrix theKWeakestRowsInAMatrix = new TheKWeakestRowsInAMatrix();

    @Test
    void get3WeakestIn5Rows() {
        int[][] mat = {
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };
        int k = 3;
        int[] expectedOutput = {2, 0, 3};

        assertArrayEquals(expectedOutput, theKWeakestRowsInAMatrix.originalKWeakestRows(mat, k));
        assertArrayEquals(expectedOutput, theKWeakestRowsInAMatrix.kWeakestRows(mat, k));
    }

    @Test
    void getFullWeakestIn5Rows() {
        int[][] mat = {
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };
        int k = 5;
        int[] expectedFullSort = {2, 0, 3, 1, 4};

        assertArrayEquals(expectedFullSort, theKWeakestRowsInAMatrix.originalKWeakestRows(mat, k));
        assertArrayEquals(expectedFullSort, theKWeakestRowsInAMatrix.kWeakestRows(mat, k));
    }

    @Test
    void get2WeakestIn4Rows() {
        int[][] mat = {
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}
        };
        int k = 2;
        int[] expectedOutput = {0, 2};

        assertArrayEquals(expectedOutput, theKWeakestRowsInAMatrix.originalKWeakestRows(mat, k));
        assertArrayEquals(expectedOutput, theKWeakestRowsInAMatrix.kWeakestRows(mat, k));
    }

    @Test
    void getFullWeakestIn4Rows() {
        int[][] mat = {
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}
        };
        int k = 4;
        int[] expectedFullSort = {0, 2, 3, 1};

        assertArrayEquals(expectedFullSort, theKWeakestRowsInAMatrix.originalKWeakestRows(mat, k));
        assertArrayEquals(expectedFullSort, theKWeakestRowsInAMatrix.kWeakestRows(mat, k));
    }

    @Test
    void get2WeakestIn3Rows() {
        int[][] mat = {
                {1, 0},
                {0, 0},
                {1, 0}
        };
        int k = 2;
        int[] expectedOutput = {1, 0};

        assertArrayEquals(expectedOutput, theKWeakestRowsInAMatrix.originalKWeakestRows(mat, k));
        assertArrayEquals(expectedOutput, theKWeakestRowsInAMatrix.kWeakestRows(mat, k));
    }

    @Test
    void getFullWeakestIn3Rows() {
        int[][] mat = {
                {1, 0},
                {0, 0},
                {1, 0}
        };
        int k = 3;
        int[] expectedFullSort = {1, 0, 2};

        assertArrayEquals(expectedFullSort, theKWeakestRowsInAMatrix.originalKWeakestRows(mat, k));
        assertArrayEquals(expectedFullSort, theKWeakestRowsInAMatrix.kWeakestRows(mat, k));
    }

    @Test
    void get1WeakestIn6Rows() {
        int[][] mat = {
                {1, 1},
                {1, 0},
                {1, 0},
                {1, 1},
                {0, 0},
                {1, 1}
        };
        int k = 1;
        int[] expectedOutput = {4};

        assertArrayEquals(expectedOutput, theKWeakestRowsInAMatrix.originalKWeakestRows(mat, k));
        assertArrayEquals(expectedOutput, theKWeakestRowsInAMatrix.kWeakestRows(mat, k));
    }

    @Test
    void getFullWeakestIn6Rows() {
        int[][] mat = {
                {1, 1},
                {1, 0},
                {1, 0},
                {1, 1},
                {0, 0},
                {1, 1}
        };
        int k = 6;
        int[] expectedFullSort = {4, 1, 2, 0, 3, 5};

        assertArrayEquals(expectedFullSort, theKWeakestRowsInAMatrix.originalKWeakestRows(mat, k));
        assertArrayEquals(expectedFullSort, theKWeakestRowsInAMatrix.kWeakestRows(mat, k));
    }

    @Test
    void get3WeakestIn5Rows_B() {
        int[][] mat = {
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1}
        };
        int k = 3;
        int[] expectedOutput = {1, 2, 3};

        assertArrayEquals(expectedOutput, theKWeakestRowsInAMatrix.originalKWeakestRows(mat, k));
        assertArrayEquals(expectedOutput, theKWeakestRowsInAMatrix.kWeakestRows(mat, k));
    }

    @Test
    void getFullWeakestIn5Rows_B() {
        int[][] mat = {
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1}
        };
        int k = 5;
        int[] expectedFullSort = {1, 2, 3, 0, 4};

        assertArrayEquals(expectedFullSort, theKWeakestRowsInAMatrix.originalKWeakestRows(mat, k));
        assertArrayEquals(expectedFullSort, theKWeakestRowsInAMatrix.kWeakestRows(mat, k));
    }
}
