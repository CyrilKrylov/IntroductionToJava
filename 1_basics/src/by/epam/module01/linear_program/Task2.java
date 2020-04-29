package by.epam.module01.linear_program;

public class Task2 {

    public static double getValueOfExpressionWithRoot(double a, double b, double c) {
        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - (Math.pow(a, 3) * c) + Math.pow(b, -2);
    }

}
