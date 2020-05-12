package by.epam.module02.decomposition;

/*Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9*/

public class Task7D {

    public static void main(String[] args) {
        System.out.println(sumOfFactorials());
    }

    public static int sumOfFactorials() {
        int outSum;

        outSum = 0;
        for (int i = 1; i <= 3; i++) {
            if (isOdd(i)) {
                outSum += getFactorial(i);
            }
        }
        return outSum;
    }

    private static boolean isOdd(int inputValue){
        return inputValue % 2 != 0;
    }

    private static int getFactorial(int inputValue) {
        if (inputValue == 1) {
            return inputValue;
        }
        int outValue;

        outValue = 1;
        for (int i = 2; i <= inputValue; i++) {
            outValue *= i;
        }
        return outValue;
    }

}
