package by.epam.module01.branching;

public class Task2B {

    public static int getMaxOfMins(int a, int b, int c, int d) {
        int firstMin = a > b ? b : a;
        int secMin = c > d ? d : c;
        return firstMin > secMin ? firstMin : secMin;
    }

}
