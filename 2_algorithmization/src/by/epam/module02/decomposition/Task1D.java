package by.epam.module02.decomposition;

/*Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел:  НОК(А, В) = A * B / НОД(A, B)*/

public class Task1D {

    public static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDevider(a, b);
    }

    private static int greatestCommonDevider(int a, int b) {
        int buffer;
        while (b != 0) {
            buffer = b;
            b = a % b;
            a = buffer;
        }
        return a;
    }


}
