package by.epam.module01.onedimensional_array;

public class Task5 {

    public static void printIf(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i + 1 < a[i]) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

}
