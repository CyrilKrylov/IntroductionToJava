package by.epam.module01.branching;


public class Task5B {

    public static double getFunctionValue(int x) {
        if (x <= 3) {
            return Math.pow(x, 2) - 3 * x + 9;
        } else {
            return 1.0 / (Math.pow(x, 3) + 3);
        }
    }

}
