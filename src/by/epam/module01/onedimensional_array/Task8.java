package by.epam.module01.onedimensional_array;

public class Task8 {

    public static int[] getNewSequence(int[] a) {
        int min = a[0];
        int count = 1;
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
                count = 1;
            } else if (min == a[i]) {
                count++;
            }
        }
        return fillNewSequence(a, count, min);
    }

    private static int[] fillNewSequence(int[] a, int size, int minValue) {
        int[] outValues = new int[a.length - size];
        for (int i = 0, j = 0; i < a.length; i++) {
            if (a[i] != minValue) {
                outValues[j] = a[i];
                j++;
            }
        }
        return outValues;
    }
}
