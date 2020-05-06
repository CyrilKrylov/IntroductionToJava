package by.epam.module02.twodimensional_array;

/*Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.*/

public class Task9A {

    public static int getColumnNumberWithMaxSumOfElement(int[][] inputMatrix){
        int maxSum = 0;
        int numberOfColumn = 0;

        for (int i = 0; i < inputMatrix[0].length; i++) {
            int sumOfColumn = 0;
            for (int j = 0; j < inputMatrix.length; j++) {
                sumOfColumn += inputMatrix[j][i];
            }
            if (sumOfColumn > maxSum) {
                maxSum = sumOfColumn;
                numberOfColumn = i + 1;
            }
        }
        return numberOfColumn;
    }

}
