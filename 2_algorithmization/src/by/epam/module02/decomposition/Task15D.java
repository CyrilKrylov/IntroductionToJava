package by.epam.module02.decomposition;

/*Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию*/

public class Task15D {

    private static final int[] AUXILARY_ARRAY;

    static {
        AUXILARY_ARRAY = new int[10];
        for (int i = 0; i < AUXILARY_ARRAY.length; i++) {
            int arrayElement = 1;
            for (int j = 0; j <i; j++) {
                arrayElement *= 10;
            }
            AUXILARY_ARRAY[i] = arrayElement;
        }
    }





    public static void main(String[] args) {
        getStrictlyIncreasingSequence(9);
    }

    public static void getStrictlyIncreasingSequence(int n) {
        int[] digits = new int[n];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = i + 1;
        }
        System.out.println(getNumberFromArrrayOfDigits(digits));

        while (digits[0] < 10 - digits.length ) {
            if (digits[digits.length - 1] < 9) {
                digits[digits.length - 1]++;
                System.out.println(getNumberFromArrrayOfDigits(digits));
            } else {
                setNextGrowingNumber(digits);
                System.out.println(getNumberFromArrrayOfDigits(digits));
            }
        }
    }

    private static void setNextGrowingNumber(int[] inputArray) {
        int indexFormChange;

        indexFormChange = getIndexFromChange(inputArray);

        inputArray[indexFormChange]++;

        for (int i = indexFormChange+1; i < inputArray.length; i++) {
            inputArray[i] = inputArray[i - 1] + 1;
        }
    }



    private static int getIndexFromChange(int[] inpArray){
        for (int i = 0, j = 9-inpArray.length; i < inpArray.length-1; i++) {
            if (inpArray[i + 1] >= j + i+2) {
                return i;
            }
        }
        return inpArray.length - 1;
    }



    private static int getNumberFromArrrayOfDigits(int[] inputArray) {
        int outNumber;

        outNumber = 0;
        for (int i = 0,j = inputArray.length-1; i < inputArray.length; i++,j--) {
            outNumber += inputArray[i] * AUXILARY_ARRAY[j];
        }

        return outNumber;
    }

}
