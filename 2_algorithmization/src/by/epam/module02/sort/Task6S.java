package by.epam.module02.sort;

/*Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.*/

import java.util.Arrays;

public class Task6S {

    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 6, 8, -9, 7, 5, 3, -10,};
        sortShell(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortShell(int[] inputArray) {
        int step = chooseStep(inputArray.length);

        while (step >= 1) {
            for (int i = step; i < inputArray.length; i++) {
                for (int j = i; j >= step; j = j - step) {
                    if (inputArray[j] < inputArray[j - step]) {
                        int temp = inputArray[j];
                        inputArray[j] = inputArray[j - step];
                        inputArray[j - step] = temp;
                    } else {
                        break;
                    }
                }
            }
            step = step / 3;
        }
    }

    private static int chooseStep(int arrrayLength) {
        int outStep = 1;
        while (outStep * 3 < arrrayLength) {
            outStep = outStep * 3 + 1;
        }
        return outStep;
    }

}
