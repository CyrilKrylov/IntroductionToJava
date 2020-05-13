package by.epam.module02.decomposition;

/*Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию*/

import static java.lang.Math.*;

public class Task14D {

    public static final long[] AUXILARY_ARRAY = new long[]{9L, 99L, 999L, 9999L, 99999L, 999999L, 9999999L,
            99999999L, 999999999L, 9999999999L, 99999999999L, 999999999999L, 9999999999999L,
            99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L,
            Long.MAX_VALUE};

    public static void main(String[] args)  {
       showArmstrongNumbers(999999999);
    }

    public static void showArmstrongNumbers(long k)  {
        int numberOfdigits;
        int newNumberOfdigits;
        long[][] arrayOfPow;
        long[] arrayOfDigits;
        long intermediateValue;



        numberOfdigits = getNumberOfDigits(k);
        arrayOfPow = generateMatrixOfPows(numberOfdigits);
        for (long i = 1; i <= k; i++) {
            arrayOfDigits = getArrayOfIncrDigits(i);

            if (arrayOfDigits == null) {
                continue;
            }
            intermediateValue = 0;
            for (long value : arrayOfDigits) {
                intermediateValue += arrayOfPow[(int) value][arrayOfDigits.length];
            }

            newNumberOfdigits = getNumberOfDigits(intermediateValue);
            if (newNumberOfdigits != arrayOfDigits.length) {
                continue;
            }

            long[] newArrOfUniqueDigits = getArrayOfDigits(intermediateValue,newNumberOfdigits);

            int newIntermediateValue = 0;
            for (long newArrOfUniqueDigit : newArrOfUniqueDigits) {
                newIntermediateValue += arrayOfPow[(int) newArrOfUniqueDigit][newArrOfUniqueDigits.length];
            }
            if (intermediateValue == newIntermediateValue) {
                System.out.println(newIntermediateValue);
            }

        }


    }

    private static long[][] generateMatrixOfPows(int numberOfdigits) {
        long[][] outMatrix;

        outMatrix = new long[10][numberOfdigits+1];
        for (int i = 1; i < outMatrix.length; i++) {
            for (int j = 0; j < outMatrix[i].length; j++) {
                outMatrix[i][j] = (long) pow(i, j);
            }
        }

        return outMatrix;
    }

    private static int getNumberOfDigits(long inputNumber) {
        for (int i = 0; ; i++) {
            if (inputNumber <= AUXILARY_ARRAY[i]) {
                return i + 1;
            }
        }

    }

    private static long[] getArrayOfIncrDigits(long inputValue) {
        int numberOfDigits;
        long[] outArray;
        long temporaryValue;
        int lastElementIndex;

        numberOfDigits = getNumberOfDigits(inputValue);
        outArray = new long[numberOfDigits];
        temporaryValue = inputValue;
        lastElementIndex = numberOfDigits - 1;

        for (int i = lastElementIndex; i >= 0; i--) {
            outArray[i] = getLastDigit(temporaryValue);
            if (i != lastElementIndex) {
                if (outArray[i + 1] != 0 && outArray[i] != 0) {
                    if (outArray[i] > outArray[i + 1]) {
                        return null;
                    }
                } else if (outArray[i + 1] != 0 && outArray[i] == 0) {
                    return null;
                }
            }
            temporaryValue /= 10;
        }
        return outArray;
    }

    public static long[] getArrayOfDigits(long inputValue, int numberOfDigits) {
        long[] outArray;
        long temporaryValue;

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



}
