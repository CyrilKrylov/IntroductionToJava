package by.epam.module02.sort;

/*Сортировка выбором. Дана последовательность чисел a1 <= a2 <=...<= an .Требуется переставить элементы так,
чтобы они были расположены по убыванию.*/

import java.util.Arrays;

public class Task3S {

    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 6, 8, -9, 7, 5, 3, 1};
        sortBySelectionInDescendingOrder(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortBySelectionInDescendingOrder (int[] inputArray){
        for (int i = 0; i < inputArray.length - 1; i++) {
            int temporaryValue = i;
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[j] > inputArray[temporaryValue]) {
                    temporaryValue = j;
                }
            }
            int buffer = inputArray[i];
            inputArray[i] = inputArray[temporaryValue];
            inputArray[temporaryValue] = buffer;
        }
    }


}
