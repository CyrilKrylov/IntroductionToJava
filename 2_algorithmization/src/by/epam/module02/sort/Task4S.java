package by.epam.module02.sort;

/*Сортировка обменами.Дана последовательность чисел a1 <= a2 <=...<= an .Требуется переставить числа в
порядке возрастания.*/

import java.util.Arrays;

public class Task4S {

    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 6, 8, -9, 7, 5, 3, 1};
        sortByBubblesInAscendingOrder(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortByBubblesInAscendingOrder(int[] inputArray) {
        boolean isChanged;
        int numberOfSwaps;

        numberOfSwaps = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            isChanged = false;
            for (int j = 0; j < inputArray.length - i - 1; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    int buffer = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = buffer;
                    numberOfSwaps++;
                    isChanged = true;
                }
            }
            if (!isChanged) {
                break;
            }
        }
        System.out.println("Количество перестановок: " + numberOfSwaps);
    }

}
