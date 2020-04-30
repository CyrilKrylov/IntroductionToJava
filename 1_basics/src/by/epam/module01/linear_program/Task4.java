package by.epam.module01.linear_program;

/*Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа*/

public class Task4 {
    public static double getReversedDouble(double inputDouble) {
        return ((int) inputDouble / 1000.0) + inputDouble*1000%1000;
    }
}
