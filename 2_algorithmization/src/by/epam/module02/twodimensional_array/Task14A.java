package by.epam.module02.twodimensional_array;

/*Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца*/

import by.epam.module02.MainModule02;

import java.util.Random;

public class Task14A {


    public static void main(String[] args) {
       MainModule02.outTwoDimensionalArray(createMatrixMoreRandomely(7,7));
       MainModule02.outTwoDimensionalArray(createMatrix(7,7));
    }

    public static int[][] createMatrixMoreRandomely(int m, int n) {
        int[][] outMatrix;
        Random random;

        outMatrix = new int[m][n];
        random = new Random();

        for (int i = 0; i < n; i++) {
            int numberOfUnits = i + 1;
            int[] randomIndexes = new int[m];

            for (int j = numberOfUnits; j > 0; j--) {
                if (j == numberOfUnits) {
                    for (int k = 0; k < randomIndexes.length; k++) {
                        randomIndexes[k] = k;
                    }
                }
                int rowIndex;

                rowIndex = random.nextInt(randomIndexes.length);
                outMatrix[randomIndexes[rowIndex]][i] = 1;
                int[] newRandomIndexes = new int[randomIndexes.length - 1];

                for (int k = 0, l = 0; k < randomIndexes.length; k++) {
                    if (k == rowIndex) {
                        continue;
                    }
                    newRandomIndexes[l] = randomIndexes[k];
                    l++;
                }
                randomIndexes = newRandomIndexes;
            }
        }
        return outMatrix;
    }

    public static int[][] createMatrix(int m, int n) {
        int[][] outMatrix;

        outMatrix = new int[m][n];

        for (int i = 0; i < outMatrix[0].length; i++) {
            int numberOfUnits = 0;

            for (int j = 0; j < outMatrix.length; j++) {
                int element = (int) Math.round(Math.random() * (i + 1));

                if (element >= 1 && numberOfUnits < (i + 1)) {
                    outMatrix[j][i] = 1;
                    numberOfUnits++;
                } else {
                    outMatrix[j][i] = 0;
                }
            }

            if (numberOfUnits != (i + 1)){
                i --;
            }
        }
        return outMatrix;
    }

}
