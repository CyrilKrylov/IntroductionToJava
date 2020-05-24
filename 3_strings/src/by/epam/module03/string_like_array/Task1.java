package by.epam.module03.string_like_array;

/* Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.*/

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        String[] strings = new String[]{"arrayElement","snakeCaseElement","inputArray"};
        translateArrayToSnakeCase(strings);
        System.out.println(Arrays.toString(strings));
    }

    public static void translateArrayToSnakeCase(String[] inputArray) {
        String arrayElement;

        for (int i = 0; i < inputArray.length; i++) {
            arrayElement = inputArray[i];
            String snakeCaseElement = "";
            for (int j = 0; j < arrayElement.length(); j++) {
                char letter = arrayElement.charAt(j);
                if (Character.isUpperCase(letter)) {
                    snakeCaseElement += "_" + Character.toLowerCase(letter);
                } else {
                    snakeCaseElement += letter;
                }
            }
            inputArray[i] = snakeCaseElement;
        }
    }

}
