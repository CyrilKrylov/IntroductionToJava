package by.epam.module02.sort;

/*Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя дополнительный массив*/

import java.util.Arrays;

public class Task1S {

    public static void main(String[] args) {
        int[] dsad = joinArrays(new int[]{1, 1, 1, 1, 1}, new int[]{2, 2, 2}, 2);
        System.out.println(Arrays.toString(dsad));
    }

    public static int[] joinArrays(int[] firstIputArray, int[] secondInputArray, int k) {
        if (k >= firstIputArray.length) {
            System.out.println("Неправильные исходные данные! k должно быть меньше количества элементов первого массива");
            return null;
        }

        int[] outArray;
        int secondInputArrayLength;
        int newLength;

        secondInputArrayLength = secondInputArray.length;
        newLength = firstIputArray.length + secondInputArrayLength;
        outArray = copyArrayWithNewLength(firstIputArray, newLength);

        for (int i = outArray.length - 1, j = firstIputArray.length - 1; i > firstIputArray.length - 1; i--, j--) {
            outArray[i] = outArray[j];
        }
        for (int i = k, j = 0; i < k + secondInputArray.length; i++, j++) {
            outArray[i] = secondInputArray[j];
        }
        return outArray;
    }

    private static int[] copyArrayWithNewLength(int[] arrayToInsert, int newLength) {
        int[] outNewArray;

        outNewArray = new int[newLength];
        for (int i = 0; i < arrayToInsert.length; i++) {
            outNewArray[i] = arrayToInsert[i];
        }

        return outNewArray;
    }

}
