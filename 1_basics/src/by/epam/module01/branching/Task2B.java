package by.epam.module01.branching;

/*Найти max{min(a, b), min(c, d)}*/

public class Task2B {

    public static int getMaxOfMins(int a, int b, int c, int d) {
        int firstMin;
        int secMin;
        
        firstMin = a > b ? b : a;
        secMin = c > d ? d : c;
        return firstMin > secMin ? firstMin : secMin;
    }

}
