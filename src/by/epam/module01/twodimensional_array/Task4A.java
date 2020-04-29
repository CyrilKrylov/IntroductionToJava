package by.epam.module01.twodimensional_array;

import java.util.Arrays;

public class Task4A {

    public static int[][] createMatrixFaster(int n) {
        int[][] outMatrix = new int[n][n];
        int[] incr = new int[n];
        int[] decr = new int[n];
        for (int i = 0, j = n; i < n; i++, j--) {
            incr[i] = i + 1;
            decr[i] = j;
        }
        for (int i = 0; i < n / 2; i++) {
            outMatrix[2 * i] = incr;
            outMatrix[2 * i + 1] = decr;
        }
        return outMatrix;
    }

    public static int[][] createMatrix(int n) {
        int[][] outMatrix = new int[n][n];
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0, k = n-1 ; j < n; j++,k--) {
                int ins = j + 1;
                outMatrix[2 * i][j] = ins;
                outMatrix[2 * i+1][k] = ins;
            }
        }
        return outMatrix;
    }

}
