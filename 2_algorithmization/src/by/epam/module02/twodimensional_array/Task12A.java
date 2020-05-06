package by.epam.module02.twodimensional_array;

/*Отсортировать строки матрицы по возрастанию и убыванию значений элементов*/

import java.util.Arrays;

public class Task12A {
    public static void main(String[] args) {
        int[] asd = new int[]{6, 5, 4, 3, 2, 1};
        sortArrayAsc(asd);
        System.out.println(Arrays.toString(asd));
        sortArrayDesc(asd);
        System.out.println(Arrays.toString(asd));
        Arrays.sort(asd);
        int[][] arr = {{2, 1, 3}, {5, 4, 6}, {8, 7, 9}};
        sortRowsOfMatrixInDescendingOrder(arr);
        for (int[] arr2 :
                arr) {
            System.out.println(Arrays.toString(arr2));
        }
    }

    public static void sortRowsOfMatrixInAscendingOrder(int[][] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            sortArrayAsc(inputArray[i]);
        }
    }

    public static void sortRowsOfMatrixInDescendingOrder(int[][] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            sortArrayDesc(inputArray[i]);
        }
    }

    private static void sortArrayAsc(int[] inputArray) {
        prepareArrayForSorting(inputArray, inputArray.length);
    }

    private static void sortArrayDesc(int[] inputArray){
        prepareArrayForSorting(inputArray, inputArray.length);
        revert(inputArray);
    }

    private static void prepareArrayForSorting(int[] inputArray, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = inputArray[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = inputArray[i];
        }
        prepareArrayForSorting(l, mid);
        prepareArrayForSorting(r, n - mid);

        merge(inputArray, l, r, mid, n - mid);
    }

    private static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    private static void revert(int[] a) {
        int mid;
        int buffer;
        int lastIndex;

        mid = a.length / 2;

        for (int i = 0; i < mid; i++) {
            lastIndex = a.length - 1 - i;
            buffer = a[i];
            a[i] = a[lastIndex];
            a[lastIndex] = buffer;
        }
    }
}
