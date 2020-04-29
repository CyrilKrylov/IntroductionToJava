package by.epam.module02.onedimensional_array;

public class Task7 {

   /* Даны действительные числа a1,a2,...,a2n . Найти
    max( a1 + a2n,a2 + a2n−1,...,an + an+1) .*/

    public static double maxOfSums(double[] a) {
        double max = a[0] + a[a.length - 1];
        for (int i = 1,j =a.length-2; i < a.length/2; i++,j--) {
            double sum = a[i] + a[j];
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }

}
