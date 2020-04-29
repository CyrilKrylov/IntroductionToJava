package by.epam.module01.onedimensional_array;

public class Task2 {

    public static int replaceOnZ(double[] a, double z) {
        int outCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > z) {
                a[i] = z;
                ++outCount;
            }
        }
        return outCount;
    }

}
