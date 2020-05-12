package by.epam.module02.decomposition;

/*Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
являются числа, сумма цифр которых равна К и которые не большее N*/

import java.util.Arrays;

public class Task12D {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArrayOfElements(5,15)));
    }

    public static int[] getArrayOfElements(int k, int n) {
        int sumOfDigits;
        int[] outArrayOfElements;
        int[] arrayOfDigits;

        outArrayOfElements = new int[]{};
        for (int i = 1; i < n; i++) {
            arrayOfDigits = Task10D.getArrayOfDigits(i);
            sumOfDigits = sumOfArray(arrayOfDigits);
            if (sumOfDigits == k) {
                outArrayOfElements = getArrayWithNewElement(outArrayOfElements, i);
            }
        }
        return outArrayOfElements;
    }

    private static int[] getArrayWithNewElement(int[] inputArray, int newElement) {
        int[] outArray;

        outArray = new int[inputArray.length + 1];

        System.arraycopy(inputArray, 0, outArray, 0, inputArray.length);

        outArray[outArray.length - 1] = newElement;
        return outArray;
    }

    private static int sumOfArray(int[] inputArray) {
        int sum;

        sum = 0;
        for (int value : inputArray) {
            sum += value;
        }
        return sum;
    }

}
