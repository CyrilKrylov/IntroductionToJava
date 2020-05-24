package by.epam.module03.string_like_object;

/*С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”*/

public class Task4O {

    public static void main(String[] args) {
        System.out.println(transform("информатика"));

    }

    private static String transform(String inputString) {
        char[] array;
        String cake;

        array = inputString.toCharArray();
        cake = "";

        cake = cake
                .concat(String.copyValueOf(array, 7, 1))
                .concat(String.copyValueOf(array, 3, 2))
                .concat(String.copyValueOf(array, 7, 1));

        return cake;
    }

}
