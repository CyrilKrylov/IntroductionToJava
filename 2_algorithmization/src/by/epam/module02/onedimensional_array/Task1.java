package by.epam.module02.onedimensional_array;

/*В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.*/

import java.util.Arrays;

public class Task1 {

    public static int getSumOfElements(int[] a, final int k) {
        int outValue = 0;
        for (int value :
                a) {
            if (value % k == 0) {
                outValue += value;
            }
        }
        return outValue;
    }

}
