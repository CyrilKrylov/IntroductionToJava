package by.epam.module01.linear_program;

import static java.lang.Math.*;

public class Task3 {

    public static double getValueOfTrigonometricExpression(double x, double y) {
        return tan(x * y) * (sin(x) + cos(y)) / (cos(x) - sin(y));
    }

}
