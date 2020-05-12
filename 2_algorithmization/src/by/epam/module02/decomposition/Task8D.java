package by.epam.module02.decomposition;

/*Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.*/

import java.util.Arrays;

public class Task8D {

    public static void main(String[] args) {
        int[] d = {1, 2, 3, 4, 5, 6,7,8,9,10};

        System.out.println(Arrays.toString(sumsOfThreeNumbers(d, 3, 9)));
    }

    public static int[] sumsOfThreeNumbers(int[] inputArray, int k, int m) {
        if (m < k) {
            sendInfoMessage("Неправильные исходные данные: k > m");
            return null;
        }

        int commonLength;

        commonLength = m - k + 1;

        if (commonLength < 3) {
            sendInfoMessage("В выбранном диапазоне нет трех последовательно расположенных элементов");
            return null;
        }
        int arrayLength;
        int lastIndex;
        int length;

        length = commonLength - commonLength % 3;
        arrayLength = length / 3;
        lastIndex = k + length;

        int[] sums = new int[arrayLength];

        for (int i = k, j=0; i < lastIndex; i = i + 3, j++) {
            sums[j] = sumOfThree(inputArray[i], inputArray[i + 1], inputArray[i + 2]);
        }
        return sums;
    }

    private static int sumOfThree(int a, int b, int c) {
        return a + b + c;
    }

    private static void sendInfoMessage(String message) {
        System.out.println(message);
    }

}
