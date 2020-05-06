package by.epam.module02.twodimensional_array;

/*Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.*/

public class Task13A {

    public static void sortColumnsOfMatrixInAscendingOrder(int[][] inputArray) {
        int[][] transponsedArrayFirstTime;
        int[][] transponsedArraySecondTime;

        transponsedArrayFirstTime = transpose(inputArray);
        Task12A.sortRowsOfMatrixInAscendingOrder(transponsedArrayFirstTime);
        transponsedArraySecondTime = transpose(transponsedArrayFirstTime);

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = transponsedArraySecondTime[i];
        }
    }

    public static void sortColumnsOfMatrixInDescendingOrder(int[][] inputArray) {
        int[][] transponsedArrayFirstTime;
        int[][] transponsedArraySecondTime;

        transponsedArrayFirstTime = transpose(inputArray);
        Task12A.sortRowsOfMatrixInDescendingOrder(transponsedArrayFirstTime);
        transponsedArraySecondTime = transpose(transponsedArrayFirstTime);

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = transponsedArraySecondTime[i];
        }
    }

    private static int[][] transpose(int[][] inputArray){
        int[][] outArr = new int[inputArray[0].length][inputArray.length];
        for (int x = 0; x < inputArray.length; x++) {
            for (int y = 0; y < inputArray[0].length; y++) {
                outArr[y][x] = inputArray[x][y];
            }
        }
        return outArr;
    }
}
