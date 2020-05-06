package by.epam.module02.twodimensional_array;

/*Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.*/

import by.epam.module02.MainModule02;

public class Task15A {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        changeOddElementsToMax(matrix);
        MainModule02.outTwoDimensionalArray(matrix);
    }

    public static void changeOddElementsToMax(int[][] inputMatrix) {
        int maxElement;

        maxElement = findMaxElement(inputMatrix);

        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[i].length; j++) {
                if (inputMatrix[i][j] % 2 != 0) {
                    inputMatrix[i][j] = maxElement;
                }
            }
        }
    }

    private static int findMaxElement(int[][] inputMatrix) {
        int maxElement = inputMatrix[0][0];

        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 1; j < inputMatrix[i].length; j++) {
                if (maxElement < inputMatrix[i][j]) {
                    maxElement = inputMatrix[i][j];
                }
            }
        }
        return maxElement;
    }

}
