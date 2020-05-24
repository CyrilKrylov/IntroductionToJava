package by.epam.module03.string_like_object;

/*Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
        def", то должно быть выведено "abcdef"*/

public class Task7O {

    public static void main(String[] args) {

    }

    public static void removeDuplicatesAndSpaces(String inputString){
        String outString;
        StringBuilder builder;

        outString = inputString;
        outString = outString.replaceAll(" ", "");
        builder = new StringBuilder(outString);
        
    }

}
