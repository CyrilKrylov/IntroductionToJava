package by.epam.module03.string_like_object;

/*Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.*/

public class Task1O {

    public static void main(String[] args) {
        System.out.println(findMaxSequenceOfSpaces("  das  df sdff    "));
    }

    public static int findMaxSequenceOfSpaces(String inputString) {
        int maxValue;
        boolean isSpaces;
        int counter;

        counter = 0;
        maxValue = 0;
        isSpaces = false;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == ' ') {
                isSpaces = true;
                counter++;
            } else if (inputString.charAt(i) != ' ' && isSpaces) {
                isSpaces = false;
                maxValue = max(maxValue, counter);
                counter = 0;
            }
        }
        if (counter > 0) {
           maxValue = max(maxValue, counter);
        }

        return maxValue;
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }

}
