package by.epam.module01.loop;

public class Task5L {

    public static double getSum(double e) {
        double outSum = 0;
        for (int i = 1;; i++) {
            double intermidValue = Math.abs(1 / Math.pow(2, i) + 1 / Math.pow(3, i)) ;
            if (intermidValue >= e) {
                outSum += intermidValue;
            } else {
                return outSum;
            }
        }
    }

}
