package by.epam.module02.decomposition;

/*Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.*/

public class Task2D {

    public static void main(String[] args) {
        System.out.println( greatestCommonDeviderForFour(72,48,9,12));
    }

    private static int greatestCommonDeviderForFour(int a, int b,int c,int d) {
        return greatestCommonDevider(greatestCommonDevider(a, b), greatestCommonDevider(c, d));
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
