package by.epam.module02.decomposition;

/*На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
из пар точек самое большое расстояние. Указание. Координаты точек занести в массив*/

import by.epam.module02.MainModule02;

import static java.lang.Math.*;

public class Task4D {

    public static void main(String[] args) {
        MainModule02.outTwoDimensionalArray(getPointsWithMaxDistance(new double[][]{{-1,1},{1,1},{4,3},{-1,-3},{-5,-3}}));
    }

    public static double[][] getPointsWithMaxDistance(double[][] pointArray) {
        double[] firstDotOfPair = new double[2];
        double[] secondDotOfPair = new double[2];
        double maxLength = 0;
        double length;

        for (int i = 0; i < pointArray.length - 1; i++) {
            for (int j = i + 1; j < pointArray.length; j++) {
                length = calculateDistanceBetweenPoints(pointArray[i], pointArray[j]);
                if (maxLength < length) {
                    maxLength = length;
                    firstDotOfPair = pointArray[i];
                    secondDotOfPair = pointArray[j];
                }
            }
        }

        return new double[][]{firstDotOfPair,secondDotOfPair};
    }


    private static double calculateDistanceBetweenPoints(double[] firstPoint, double[] secondPoint) {
        return sqrt(pow(secondPoint[0] - firstPoint[0], 2) + pow(secondPoint[1] - firstPoint[1], 2));
    }

}
