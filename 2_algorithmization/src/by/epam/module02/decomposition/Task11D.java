package by.epam.module02.decomposition;

/*Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр*/

public class Task11D {

    public static void main(String[] args) {
        System.out.println(numberWithMaxDigits(2341,12312));
    }

    public static int numberWithMaxDigits(int a, int b) {
        return Task10D.getNumberOfDigits(a) > Task10D.getNumberOfDigits(b) ? a : b;
    }

}
