package by.epam.module02.twodimensional_array;

/*Сформировать квадратную матрицу порядка N по правилу: A[I,J] = sin((I² - J²) / N)
и подсчитать количество положительных элементов в ней*/

public class Task7A {

    public static double[][] getMatrixByRule(int n) {
        double[][] outMatrix;

        outMatrix = new double[n][n];
        int numberOfPositiveElements = 0;

        for (int i = 0; i < outMatrix.length; i++) {
            for (int j = 0; j < outMatrix[i].length; j++) {
                outMatrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if (outMatrix[i][j] > 0) {
                    numberOfPositiveElements++;
                }
            }
        }
        System.out.println("Количество положительных элементов " + numberOfPositiveElements);
        return outMatrix;
    }

}
