package by.epam.module01.loop;

/*Найти сумму квадратов первых ста чисел*/

public class Task3L {

    public static long getSumOfSquares() {
    	long outSum = 0;
        for (int i = 1; i <= 100 ; i++) {
            outSum = outSum + i * i;
        }
        return outSum;
    }

}
