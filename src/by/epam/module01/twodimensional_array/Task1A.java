package by.epam.module01.twodimensional_array;

public class Task1A {

    public static void outOddColumns(int[][] a) {
        for (int i = 0; i < a.length; i += 2) {
            if (a[0][i] > a[a[i].length - 1][i]) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[j][i] + " ");
                }
            }
        }
        System.out.println();
    }

}
