package by.epam.module01.onedimensional_array;

public class Task10 {

    public static void compressArray(int[] a) {
        int significantElements = a.length % 2 == 0 ? a.length / 2 : a.length / 2 + 1;
        for (int i = 1; i < significantElements; i++) {
            a[i] = a[i * 2];
        }
        for (int i = significantElements; i < a.length; i++) {
            a[i] = 0;
        }
    }
}
