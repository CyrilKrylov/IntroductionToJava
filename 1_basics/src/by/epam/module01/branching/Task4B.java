package by.epam.module01.branching;

public class Task4B {

    public static String doesBrickFit(int a, int b, int x, int y, int z) {
        if (a <= 0 || b <= 0 || x <= 0 || y <= 0 || z <= 0) {
            return "Нулевое или отрицательное зачение стороны";
        }
        if (a >= x && b >= y
                || a >= x && b >= z
                || a >= y && b >= x
                || a >= y && b >= z
                || a >= z && b >= x
                || a >= z && b >= y) {
            return "Кирпич пройдет через отверстие";
        }
        return "Кирпич не пройдет через отверстие";
    }

}
