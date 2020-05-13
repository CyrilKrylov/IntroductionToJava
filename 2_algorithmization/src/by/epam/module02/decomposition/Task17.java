package by.epam.module02.decomposition;

/*Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.*/

import java.util.Arrays;

public class Task17 {

    private static final int[] AUXILARY_ARRAY = new int[]{9, 99, 999, 9999, 99999, 999999, 9999999,
            99999999, 999999999, Integer.MAX_VALUE};

    public static void main(String[] args) {
        System.out.println(getNumberOfIterations(1111111111));
    }

    public static int getNumberOfIterations(int inputNumber) {
        int numberOfIterrations;

        numberOfIterrations = 0;
        while (inputNumber > 0) {
            numberOfIterrations++;
            inputNumber -= getSumOfDigits(inputNumber);
        }

        return numberOfIterrations;
    }

    public static int getSumOfDigits(int inputValue) {
        int numberOfDigits;
        int temporaryValue;
        int sumOfDigits;

        numberOfDigits = getNumberOfDigits(inputValue);
        temporaryValue = inputValue;
        sumOfDigits = 0;

        for (int i = numberOfDigits - 1; i >= 0; i--) {
            sumOfDigits += getLastDigit(temporaryValue);
            temporaryValue /= 10;
        }
        return sumOfDigits;
    }

    private static int getLastDigit(int inputNumber) {
        return inputNumber % 10;
    }

    private static int getNumberOfDigits(int inputNumber) {

        for (int i = 0; ; i++) {
            if (inputNumber <= AUXILARY_ARRAY[i]) {
                return i + 1;
            }
        }

    }

}
