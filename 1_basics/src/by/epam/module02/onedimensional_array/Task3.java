package by.epam.module02.onedimensional_array;

import java.util.Arrays;

public class Task3 {

    public static void countNumbers(float[] a) {
        int zeros = 0;
        int positive = 0;
        int negative = 0;
        for (float value :
                a) {
            if (value == 0) {
                ++zeros;
            } else if (value > 0) {
                ++positive;
            } else {
                ++negative;
            }
        }
        System.out.println("Количество нолей: " + zeros + ", количество положительных чисел: " + positive +
                ", количество отрицательных чисел: " + negative);

    }

}
