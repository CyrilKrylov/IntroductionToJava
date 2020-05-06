package by.epam.module02.twodimensional_array;

/*В числовой матрице поменять местами два столбца любых столбца, т.е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8A {

    public static final String MESSAGE = "Номер колонки больше размера матрицы.\nВведите повтороно >>";


    public static void replaceColumns(int[][] inputMatrix) {

        int numberOfFirstColumn;
        int numberOfSecondColumn;

        outUserMessage("Введите номер первой колонки >>");
        while (true) {
            numberOfFirstColumn = getNumberOfColumn();
            if (numberOfFirstColumn <= inputMatrix[0].length) {
                break;
            }
            outUserMessage(MESSAGE);
        }

        outUserMessage("Введите номер второй колонки >>");
        while (true) {
            numberOfSecondColumn = getNumberOfColumn();
            if (numberOfSecondColumn <= inputMatrix[0].length) {
                if (numberOfFirstColumn != numberOfSecondColumn) {
                    break;
                }
                outUserMessage("Номера колонок совпадают\nВведите повтороно >>");
            }
            System.out.println(MESSAGE);
        }

        int intermediateValue;
        int firstIndexOfArray = numberOfFirstColumn - 1;
        int secondIndexOfArray = numberOfSecondColumn - 1;
        for (int i = 0; i < inputMatrix.length; i++) {
            intermediateValue = inputMatrix[i][firstIndexOfArray];
            inputMatrix[i][firstIndexOfArray] = inputMatrix[i][secondIndexOfArray];
            inputMatrix[i][secondIndexOfArray] = intermediateValue;
        }

    }

    private static int getNumberOfColumn() {
        try {
            BufferedReader reader;
            String inputLine;
            String regExpNumber;
            Pattern numberPattern;
            Matcher numberMatcher;
            int outNumberOfColumn;

            regExpNumber = "^[1-9][0-9]*$";
            numberPattern = Pattern.compile(regExpNumber);
            reader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                inputLine = reader.readLine();
                numberMatcher = numberPattern.matcher(inputLine);
                if (!numberMatcher.find()) {
                    outUserMessage("Неправильный формат вводимых данных.\nВведите повтороно >>");
                    continue;
                } else {
                    outNumberOfColumn = Integer.parseInt(inputLine);
                    if (outNumberOfColumn <= 0) {
                        outUserMessage("Неправильный формат вводимых данных.\nВведите повтороно >>");
                        continue;
                    }
                }
                return outNumberOfColumn;
            }
        } catch (IOException e) {
            return -1;
        }
    }

    private static void outUserMessage(String message) {
        System.out.println(message);
    }

}
