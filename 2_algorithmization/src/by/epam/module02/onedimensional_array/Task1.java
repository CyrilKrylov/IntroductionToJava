package by.epam.module02.onedimensional_array;

import java.util.Arrays;

public class Task1 {

    public static int getSumOfElementsStream(int[] a, final int k) {
        return Arrays.stream(a).filter(value -> value % k == 0).reduce(Integer::sum).orElse(0);
    }

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
