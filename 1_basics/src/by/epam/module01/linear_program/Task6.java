package by.epam.module01.linear_program;

public class Task6 {

    public static boolean isInArea(int x, int y) {
        return (((!(y > 4) && !(y < -3)) && (!(x > 2) && !(x < -2))) ||
                ((!(y > 0) && !(y < -3)) && (!(x > 4) && !(x < -4)))) && (x != 0 && y != -1);

    }

}
