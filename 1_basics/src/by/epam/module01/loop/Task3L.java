package by.epam.module01.loop;

public class Task3L {

    public static float getSumOfSquares() {
        float outSum = 0;
        for (int i = 1; i <= 100 ; i++) {
            outSum += i * i;
        }
        return outSum;
    }

}
