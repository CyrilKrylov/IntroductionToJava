package by.epam.module03.string_like_array;

/*В строке найти количество цифр*/

public class Task3 {

    public static void main(String[] args) {
        System.out.println(numberOfDigitsInString("sdjfsdjf 986 qwe210sdh"));
    }

    public static int numberOfDigitsInString(String inputString) {
        char[] charsOfString;
        int numberOfDigits;

        charsOfString = inputString.toCharArray();
        numberOfDigits = 0;

        for (int i = 0; i < charsOfString.length; i++) {
            if (charsOfString[i] < 58 && charsOfString[i] > 47) {
                numberOfDigits++;
            }
        }
        return numberOfDigits;
    }

}
