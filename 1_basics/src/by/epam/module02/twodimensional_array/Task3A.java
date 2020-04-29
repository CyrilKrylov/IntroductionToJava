package by.epam.module02.twodimensional_array;

public class Task3A {

    public static void getKAndP(int[][] a, int k, int p) {
        int rowIndex = k - 1;
        int columnIndex = p - 1;
        for (int i = 0; i < a[0].length; i++) {
            System.out.print(a[rowIndex][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i].length > columnIndex) {
                System.out.print(a[i][columnIndex] + " ");
            }
        }
        System.out.println();
    }

}
