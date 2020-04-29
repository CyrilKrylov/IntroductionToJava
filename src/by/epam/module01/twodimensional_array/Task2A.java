package by.epam.module01.twodimensional_array;

public class Task2A {

    public static void outDiagonalValues(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i][i]+" ");
        }
        System.out.println();
    }

}
