package by.epam.module03.string_like_object;

/*Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
        def", то должно быть выведено "abcdef"*/

public class Task7O {

    public static void main(String[] args) {
        System.out.println(removeDuplicatesAndSpaces("abc cde      def"));
    }

    public static String removeDuplicatesAndSpaces(String inputString){
        String outString;
        StringBuilder builder;

        outString = inputString;
        outString = outString.replaceAll(" ", "");
        builder = new StringBuilder(outString);
        for (int i = 0; i < builder.length(); i++) {
            String charString = String.valueOf(builder.charAt(i));
            int index;
            while ((index = builder.indexOf(charString, i + 1)) != -1) {
                builder.deleteCharAt(index);
            }
        }

        return builder.toString();
    }

}
