package by.epam.module02.onedimensional_array;

/*Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами*/

public class Task6 {

    public static double sumOfSequenceNumbers(double[] a) {
        double sum = 0;
        label:
        for (int i = 1; i < a.length; i++) {
            if (i == 1) {
                sum += a[i];
            } else {
                int currentIndex = i + 1;
                for (int j = 2; j < currentIndex; j++) {
                    if (currentIndex % j == 0) {
                        continue label;
                    }
                }
                sum += a[i];
            }
        }
        return sum;
    }

}
