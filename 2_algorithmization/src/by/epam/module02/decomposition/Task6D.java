package by.epam.module02.decomposition;

/*Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми*/

public class Task6D {

    public static void main(String[] args) {
        System.out.println(isCoprimeIntegers(3, 15, 30));
    }

    public static boolean isCoprimeIntegers(int a, int b, int c) {
        return greatestCommonDevider(greatestCommonDevider(a, b), c)==1;
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
