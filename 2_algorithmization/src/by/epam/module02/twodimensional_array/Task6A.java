package by.epam.module02.twodimensional_array;

public class Task6A {

    public static int[][] createMatrix(int n) {
        int[][] outMatrix = new int[n][n];
        for (int i = 0; i < outMatrix.length / 2; ++i) {
            for (int j = i; j < n - i; j++) {
                outMatrix[i][j] = 1;
                outMatrix[outMatrix.length - i - 1][j] = 1;
            }
        }
        return outMatrix;
    }

}
