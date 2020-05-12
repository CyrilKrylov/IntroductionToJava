package by.epam.module02.decomposition;

/*Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию*/

import by.epam.module02.MainModule02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.lang.Math.*;

public class Task14D {

    public static void main(String[] args) {
        showArmstrongNumbers(1234567891231L);
     }

    public static void showArmstrongNumbers(long k){
        int numberOfdigits;
        long[][] arrayOfPow;
        int[] arrayOfUniqueHashes;
        long[] arrayOfUniqueDigits;
        int hashOfUniqueArray;
        long intermediateValue;

        numberOfdigits = getNumberOfDigits(k);
        arrayOfPow = generateMatrixOfPow(numberOfdigits);
        arrayOfUniqueHashes = new int[0];
        for (long i = 1; i <= k; i++) {
            arrayOfUniqueDigits = getArrayOfDigits(i);
            Arrays.sort(arrayOfUniqueDigits);
            hashOfUniqueArray = Arrays.hashCode(arrayOfUniqueDigits);
            if (Arrays.binarySearch(arrayOfUniqueHashes, hashOfUniqueArray)<0) {
                arrayOfUniqueHashes = getArrayWithNewElement(arrayOfUniqueHashes, hashOfUniqueArray);
                intermediateValue = 0;
                for (int j = 0; j < arrayOfUniqueDigits.length; j++) {
                    intermediateValue += arrayOfPow[(int) arrayOfUniqueDigits[j]][arrayOfUniqueDigits.length];
                }

                long[] newArrOfUniqueDigits = getArrayOfDigits(intermediateValue);

                int newIntermediateValue = 0;
                for (int j = 0; j < newArrOfUniqueDigits.length; j++) {
                    newIntermediateValue += arrayOfPow[(int) newArrOfUniqueDigits[j]][newArrOfUniqueDigits.length];
                }
                if (intermediateValue == newIntermediateValue) {
                    System.out.println(newIntermediateValue+" ");
                }
            }
        }



    }



    private static long[][] generateMatrixOfPow(int numberOfdigits) {
        long[][] outMatrix;

        outMatrix = new long[10][numberOfdigits];
        for (int i = 1; i < outMatrix.length; i++) {
            for (int j = 0; j < outMatrix[i].length; j++) {
                outMatrix[i][j] = (long) pow(i, j);
            }
        }

        return outMatrix;
    }

    private static int getNumberOfDigits(long inputNumber) {
        long[] auxiliaryArray;

        auxiliaryArray = new long[]{9L, 99L, 999L, 9999L, 99999L, 999999L, 9999999L,
                99999999L, 999999999L, 9999999999L,99999999999L,999999999999L,9999999999999L,
                99999999999999L,999999999999999L,9999999999999999L,99999999999999999L,999999999999999999L,
                Long.MAX_VALUE};

        for (int i = 0; ; i++) {
            if (inputNumber <= auxiliaryArray[i]) {
                return i + 1;
            }
        }

    }

    public static long[] getArrayOfDigits(long inputValue) {
        int numberOfDigits;
        long[] outArray;
        long temporaryValue;

        numberOfDigits = getNumberOfDigits(inputValue);
        outArray = new long[numberOfDigits];
        temporaryValue = inputValue;

        for (int i = outArray.length - 1; i >= 0; i--) {
            outArray[i] = getLastDigit(temporaryValue);
            temporaryValue /= 10;
        }
        return outArray;
    }

    private static long getLastDigit(long inputNumber) {
        return inputNumber % 10;
    }

    private static int[] getArrayWithNewElement(int[] inputArray, int newElement) {
        int[] outArray;

        outArray = new int[inputArray.length + 1];

        System.arraycopy(inputArray, 0, outArray, 0, inputArray.length);

        outArray[outArray.length - 1] = newElement;
        return outArray;
    }



}
