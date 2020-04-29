package by.epam.module02.twodimensional_array;

public class Task5A {

    public static int[][] createMatrix1(int n) {
        int[][] outMatrix = new int[n][n];
        for (int i = 0, j = n - 1; j >= 0; i++, j--) {
            for (int k = 0; k < n; k++) {
                outMatrix[i][k] = i + 1;
                if (k == j) {
                    break;
                }
            }
        }
        return outMatrix;
    }

}
