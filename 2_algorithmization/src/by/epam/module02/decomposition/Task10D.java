package by.epam.module02.decomposition;

/*Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
являются цифры числа N*/

import java.util.Arrays;

public class Task10D {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArrayOfDigits(50000)));
    }

    public static int[] getArrayOfDigits(int inputValue) {
        int numberOfDigits;
        int[] outArray;
        int temporaryValue;

        numberOfDigits = getNumberOfDigits(inputValue);
        outArray = new int[numberOfDigits];
        temporaryValue = inputValue;

        for (int i = outArray.length - 1; i >= 0; i--) {
            outArray[i] = getLastDigit(temporaryValue);
            temporaryValue /= 10;
        }
        return outArray;
    }

    private static int getLastDigit(int inputNumber) {
        return inputNumber % 10;
    }

    public static int getNumberOfDigits(int inputNumber) {
        int[] auxiliaryArray;

        auxiliaryArray = new int[]{9, 99, 999, 9999, 99999, 999999, 9999999,
                99999999, 999999999, Integer.MAX_VALUE};

        for (int i = 0; ; i++) {
            if (inputNumber <= auxiliaryArray[i]) {
                return i + 1;
            }
        }

    }

}
