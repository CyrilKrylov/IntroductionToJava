package by.epam.module01.branching;

public class Task1B {

    public static String isTriangle(int a, int b) {
        return !(a + b < 180 && a > 0 && b > 0) ? "Такой треугольник не существует" :
                a + b == 90 ? "Это прямоугольный треугольник" : "Это треугольник";
    }

}
