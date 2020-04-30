package by.epam.module02.onedimensional_array;

/*Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i*/

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
