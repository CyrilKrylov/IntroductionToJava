package by.epam.module02.twodimensional_array;

/*Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз*/

import java.util.Random;

public class Task11A {

    public static void createMatrix(){
        Random random;
        int[][] outMatrix;
        StringBuilder stringOfRows;

        random = new Random();
        outMatrix = new int[10][20];
        stringOfRows = new StringBuilder("Номера строк, в которых число 5 встречается три и более раз: ");

        for (int i = 0; i < outMatrix.length; i++) {
            int countNumber5 = 0;
            for (int j = 0; j < outMatrix[i].length; j++) {
                int numberOfElement = random.nextInt(15);
                outMatrix[i][j] = numberOfElement;
                System.out.print(numberOfElement+" ");
                if (numberOfElement == 5) {
                    countNumber5++;
                }
            }
            System.out.println();
            if (countNumber5 >= 3) {
                int numberOfRow = i + 1;
                stringOfRows.append(numberOfRow).append(" ");
            }
        }
        System.out.print(stringOfRows);
    }

}
