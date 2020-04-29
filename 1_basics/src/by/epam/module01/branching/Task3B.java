package by.epam.module01.branching;

public class Task3B {

    public static boolean isOnSingleLine(int x1,int y1,int x2,int y2,int x3,int y3) {
        return ((x3 - x1) / (x2 - x1)) == ((y3 - y1) / (y2 - y1));
    }

}
