package by.epam.module03.string_like_array;

/*Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.*/

import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {
        System.out.println(removeExtraWhitespaces("  ab   cd  a   sd  "));
    }

    public static String removeExtraWhitespaces(String inputString){
        String outString;

        outString = removeSideWhitespaces(inputString);
        outString = removeInnerExtraWhitespaces(outString);

        return outString;
    }

    private static String removeInnerExtraWhitespaces(String inputString) {
        String outString;
        boolean isSpacesStart;
        int indexFrom;

        isSpacesStart = false;
        outString = inputString;
        indexFrom = 0;
        for (int i = 1;; i++) {
            if (i > outString.length()-1) {
                break;
            }
            if (outString.charAt(i) == ' ' && !isSpacesStart) {
                isSpacesStart = true;
            } else if (outString.charAt(i) == ' ' && isSpacesStart) {
                if (indexFrom == 0) {
                    indexFrom = i;
                }
            } else if (outString.charAt(i) != ' ' && isSpacesStart) {
                if (indexFrom != 0) {
                    outString = cutMiddle(outString, indexFrom, i);
                    i = indexFrom;
                    indexFrom = 0;
                }
                isSpacesStart = false;
            }
        }
        return outString;
    }

    private static String removeSideWhitespaces(String inputString) {
        String outString;
        int rightSpaces;
        int leftSpaces;
        char[] arrayOfInputChars;


        outString = inputString;
        rightSpaces = inputString.length();
        leftSpaces = 0;
        arrayOfInputChars = inputString.toCharArray();

        while (arrayOfInputChars[leftSpaces] == ' ' && leftSpaces < rightSpaces  ) {
            leftSpaces++;
        }
        while (leftSpaces < rightSpaces && arrayOfInputChars[rightSpaces - 1] == ' ') {
            rightSpaces--;
        }

        if (leftSpaces > 0 || rightSpaces < inputString.length()) {
            outString = substring(outString,leftSpaces, rightSpaces);
        }
        return outString;
    }

    private static String cutMiddle(String inputString, int indexBefore, int indexAfter) {
        return substring(inputString, 0, indexBefore) +
                substring(inputString, indexAfter, inputString.length());
    }

    private static String substring(String inputString,int indexFrom, int indexTo) {
        char[] arrayOfInputString;

        arrayOfInputString = inputString.toCharArray();

        return String.copyValueOf(Arrays.copyOfRange(arrayOfInputString, indexFrom, indexTo));
    }

}
