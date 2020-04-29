package by.epam.module01.loop;

public class Task2L {

    public static void getFunctionValues(double a, double b, double h) {
        double outvalue;
        if (a >= b) {
            System.out.println("Данные введены неверно: a>=b");
        }
        for (double i = a; i <= b; i += h) {
            if (i <= 2) {
                outvalue = -i;
            } else {
                outvalue = i;
            }
            System.out.println("Значение функции равно "+outvalue);
        }
    }
}
