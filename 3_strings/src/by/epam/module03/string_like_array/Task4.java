package by.epam.module03.string_like_array;

/*В строке найти количество чисел*/

public class Task4 {

    public static void main(String[] args) {
        System.out.println(countNumbersInString("1d2ssdg1232345dg44h4"));
    }

    public static int countNumbersInString(String inputString) {
        int numberCounter;
        char lastChar;

        numberCounter = 0;
        for (int i = 1; i < inputString.length(); i++) {
            if (inputString.charAt(i-1) < 58 && inputString.charAt(i-1) > 47&&
                    (inputString.charAt(i) >= 58 || inputString.charAt(i) <= 47)) {
                numberCounter++;
            }
        }

        lastChar = inputString.charAt(inputString.length() - 1);

        if (lastChar < 58 && lastChar > 47) {
            numberCounter++;
        }
        return numberCounter;
    }

}
