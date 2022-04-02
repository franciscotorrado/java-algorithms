package org.pacotorrado.algorithms;

public class TheKWeakestRowsInAMatrix {
    public int[] kWeakestRows(final int[][] mat,
                              final int k) {
        int[][] lengths = calculateLength(k, mat);

        sort(lengths);

        return getFirstKElements(k, lengths);
    }

    private int[][] calculateLength(final int k,
                                    final int[][] mat) {
        int height = mat.length;
        int width = mat[0].length;
        int[][] lengths = new int[height][2];
        for (int j = 0; j < height; j++) {
            int length = 0;
            for (int i = 0; i < width; i++) {
                length += mat[j][i];
                if (mat[j][i] == 0) break;
            }
            lengths[j][0] = j;
            lengths[j][1] = length;
        }
        return lengths;
    }

    private void sort(final int[][] lengths) {
        boolean pending;
        do {
            pending = false;
            for (int i = 0; i < lengths.length - 1; i++) {
                if (lengths[i][1] > lengths[i + 1][1]) {
                    int[] temp = lengths[i];
                    lengths[i] = lengths[i + 1];
                    lengths[i + 1] = temp;
                    pending = true;
                    break;
                }
            }
        } while (pending);
    }

    private int[] getFirstKElements(final int k,
                                    final int[][] lengths) {
        int[] output = new int[k];
        for (int i = 0; i < k; i++) {
            output[i] = lengths[i][0];
        }

        return output;
    }

    public int[] originalKWeakestRows(int[][] mat,
                                      int k) {
        int height = mat.length;
        int width = mat[0].length;

        int[][] lengths = new int[height][2];

        for (int j = 0; j < height; j++) {
            int length = 0;
            for (int i = 0; i < width; i++) {
                length += mat[j][i];
                if (mat[j][i] == 0) break;
            }
            lengths[j][0] = j;
            lengths[j][1] = length;
        }

        boolean pending;
        do {
            pending = false;
            for (int i = 0; i < height - 1; i++) {
                if (lengths[i][1] > lengths[i + 1][1]) {
                    int[] temp = lengths[i];
                    lengths[i] = lengths[i + 1];
                    lengths[i + 1] = temp;
                    pending = true;
                    break;
                }
            }
        } while (pending);

        int[] output = new int[k];
        for (int i = 0; i < k; i++) {
            output[i] = lengths[i][0];
        }

        return output;
    }
}
