package by.epam.module02.decomposition;

/*Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию*/

import java.util.Arrays;

public class Task16D {

    private static final int[] AUXILARY_ARRAY;

    static {
        AUXILARY_ARRAY = new int[11];
        for (int i = 0; i < AUXILARY_ARRAY.length-1; i++) {
            int arrayElement = 1;
            for (int j = 0; j < i; j++) {
                arrayElement *= 10;
            }
            AUXILARY_ARRAY[i] = arrayElement;
        }
        AUXILARY_ARRAY[AUXILARY_ARRAY.length - 1] = Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
            System.out.println("Сумма n - значных чисел, содержащих только нечетные циф: " + getSum(9));
    }

    public static int getSum(int n) {
        int[] numbersWithOddDigits;
        int[] digits;
        int sumOfNumbersWithOddDigits;
        int numberOfEvenDigits;

        digits = new int[n];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = 1;
        }
        numbersWithOddDigits = new int[]{getNumberFromArrrayOfDigits(digits)};

        while (digits[0] < 9) {
            if (digits[digits.length - 1] < 9) {
                digits[digits.length - 1] += 2;
                numbersWithOddDigits = getArrayWithNewElement(
                        numbersWithOddDigits,
                        getNumberFromArrrayOfDigits(digits)
                );
            } else {
                setNextNumberWithOddDigits(digits);
                numbersWithOddDigits = getArrayWithNewElement(
                        numbersWithOddDigits,
                        getNumberFromArrrayOfDigits(digits)
                );
            }
        }

        System.out.println(Arrays.toString(numbersWithOddDigits));
        sumOfNumbersWithOddDigits = 0;

        for (int i = 0; i < numbersWithOddDigits.length; i++) {
            sumOfNumbersWithOddDigits += numbersWithOddDigits[i];
        }

        numberOfEvenDigits = getNumberOfEvenDigits(sumOfNumbersWithOddDigits);
        System.out.println("Количество четных цифр в найденной сумме " + numberOfEvenDigits);

        return sumOfNumbersWithOddDigits;
    }

    private static void setNextNumberWithOddDigits(int[] inputArray){
        int indexFormChange;

        indexFormChange = getIndexFromChange(inputArray);

        inputArray[indexFormChange] += 2;
        for (int i = indexFormChange+1; i < inputArray.length; i++) {
            inputArray[i] = 1;
        }
    }

    private static int getIndexFromChange(int[] inpArray) {
        for (int i = 0; i < inpArray.length - 1; i++) {
            if (inpArray[i+1] >= 9) {
                return i;
            }
        }
        return inpArray.length - 1;
    }

    private static int getNumberFromArrrayOfDigits(int[] inputArray) {
        int outNumber;

        outNumber = 0;
        for (int i = 0, j = inputArray.length - 1; i < inputArray.length; i++, j--) {
            outNumber += inputArray[i] * AUXILARY_ARRAY[j];
        }

        return outNumber;
    }

    private static int[] getArrayWithNewElement(int[] inputArray, int newElement) {
        int[] outArray;

        outArray = new int[inputArray.length + 1];

        System.arraycopy(inputArray, 0, outArray, 0, inputArray.length);

        outArray[outArray.length - 1] = newElement;
        return outArray;
    }

    private static int getNumberOfEvenDigits(int inputValue) {
        int temporaryValue;
        int numberOfEvenDigits;
        int numberOfDigits = getNumberOfDigits(inputValue);

        temporaryValue = inputValue;
        numberOfEvenDigits = 0;

        for (int i = 0; i < numberOfDigits; i++) {
            if (isEven(getLastDigit(temporaryValue))) {
                numberOfEvenDigits++;
            }
            temporaryValue /= 10;
        }
        return numberOfEvenDigits;
    }

    private static boolean isEven(int inputValue) {
        return inputValue % 2 == 0;
    }

    private static int getLastDigit(int inputNumber) {
        return inputNumber % 10;
    }

    private static int getNumberOfDigits(int inputNumber) {
        for (int i = 0; ; i++) {
            if (inputNumber <= AUXILARY_ARRAY[i+1]-1) {
                return i + 1;
            }
        }

    }

}
