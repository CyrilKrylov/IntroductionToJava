package by.epam.module02.sort;

/*Сортировка вставками. Дана последовательность чисел a1,a2,...,an . Требуется переставить числа в порядке
возрастания.*/

import java.util.Arrays;

public class Task5S {

    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 6, 8, -9, 7, 5, 3, -10,};
        sortByInserts(array);
        System.out.println(Arrays.toString(array));

    }

    public static void sortByInserts(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            int previousElement = i - 1;
            int indexOfsearchedElement;

            if (inputArray[previousElement] > inputArray[i]) {
                int tmp = inputArray[i];
                indexOfsearchedElement = binarySearch(inputArray, previousElement, inputArray[i]);
                if (indexOfsearchedElement >= 0) {
                    for (int j = i - 1, k = i; j > indexOfsearchedElement - 1; j--, k--) {
                        inputArray[k] = inputArray[j];
                    }
                    inputArray[indexOfsearchedElement] = tmp;
                }
            }
        }
    }

    private static int binarySearch(int[] inputArray, int toElement, int searchedElement) {
        int firstElementIndex = 0;
        int lastElementIndex = toElement - 1;

        while (firstElementIndex <= lastElementIndex) {
            int mid = (firstElementIndex + lastElementIndex) / 2;
            int midVal = inputArray[mid];

            if (midVal < searchedElement) {
                firstElementIndex = mid + 1;
            } else if (midVal > searchedElement) {
                lastElementIndex = mid - 1;
            } else {
                return mid;
            }
        }
        return firstElementIndex;
    }


}
