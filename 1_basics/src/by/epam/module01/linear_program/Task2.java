package by.epam.module01.linear_program;

/*Вычислить значение выражения по формуле (все переменные принимают действительные значения):
𝑏 + √𝑏2 + 4𝑎𝑐
2𝑎 − 𝑎3𝑐 + 𝑏−2*/

public class Task2 {

    public static double getValueOfExpressionWithRoot(double a, double b, double c) {
        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - (Math.pow(a, 3) * c) + Math.pow(b, -2);
    }

}
