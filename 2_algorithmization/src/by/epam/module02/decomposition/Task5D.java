package by.epam.module02.decomposition;

/*Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов)*/

public class Task5D {

    public static void main(String[] args) {
        System.out.println(secondMaxInArray(new int[]{1, 7, 3, 4, 5, 6, 8}));
    }

    public static int secondMaxInArray(int[] inputArray) {
        int max;
        int outValue;

        max = maxInArray(inputArray);
        outValue = inputArray[0];

        for (int i : inputArray) {
            if (i > outValue && i < max) {
                outValue = i;
            }
        }
        return outValue;
    }

    private static int maxInArray(int[] inputArray) {
        int max;

        max = inputArray[0];
        for (int i : inputArray) {
            max = max(max, i);
        }
        return max;
    }

    private static int max(int a, int b) {
        return a < b ? b : a;
    }

}
