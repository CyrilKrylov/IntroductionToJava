package by.epam.module02.twodimensional_array;

/*Найти положительные элементы главной диагонали квадратной матрицы*/

public class Task10A {

    public static void serchPositiveElements(int[][] inputMatrix){
        System.out.println("Положительные элементы главной диагонали квадратной матрицы: ");
        for (int i = 0; i < inputMatrix.length; i++) {
            if (inputMatrix[i][i] > 0) {
                System.out.println(String.format("элемент матрицы a[%d][%d]) = %d; ", i, i, inputMatrix[i][i]));
            }
        }
    }

}
