package by.epam.module03.string_like_object;

/*Из заданной строки получить новую, повторив каждый символ дважды.*/

public class Task6O {

    public static void main(String[] args) {
        System.out.println(duplicateLetters("duplicate"));
    }

    private static String duplicateLetters(String inputString) {
        StringBuilder stringBuilder;

        stringBuilder = new StringBuilder(inputString);

        for (int i = 0; i < stringBuilder.length(); i = i + 2) {
            stringBuilder.insert(i, stringBuilder.charAt(i));
        }
        return stringBuilder.toString();
    }

}
