package by.epam.module01.linear_program;

/*Вычислить значение выражения по формуле (все переменные принимают действительные значения):
	𝑡𝑔 𝑥𝑦(𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦)/(𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦) */

import static java.lang.Math.*;

public class Task3 {

    public static double getValueOfTrigonometricExpression(double x, double y) {
        return tan(x * y) * (sin(x) + cos(y)) / (cos(x) - sin(y));
    }

}
