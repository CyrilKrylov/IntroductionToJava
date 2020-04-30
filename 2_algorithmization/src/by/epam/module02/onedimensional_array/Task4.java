package by.epam.module02.onedimensional_array;

/*Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов*/

public class Task4 {

    public static void swapMinMax(double[] a) {
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[minIndex] > a[i]) {
                minIndex = i;
            }
            if (a[maxIndex] < a[i]) {
                maxIndex = i;
            }
        }
        double buffer = a[maxIndex];
        a[maxIndex] = a[minIndex];
        a[minIndex] = buffer;
    }

}
