package by.epam.module02.sort;

/*Даны дроби p1/q1 ... pn/qn  ( pi, qi - натуральные). Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания*/

import java.util.Arrays;

public class Task8S {

    public static void main(String[] args) {
        int[] devidends = new int[]{2, 3, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] deviders = new int[]{5, 10, 15, 7, 12, 7, 13, 15, 16, 17};
        sortFractionArray(devidends, deviders);
        System.out.println(Arrays.toString(devidends));
        System.out.println(Arrays.toString(deviders));
    }

    public static void sortFractionArray(int[] devidends, int[] deviders) {
        if (devidends.length != deviders.length) {
            System.out.println("Неправильные исходные данные");
            return;
        }

        int gcd;
        int lcm;

        for (int i = 1; i < devidends.length; i++) {
            if (deviders[i] == deviders[i - 1]) {
                continue;
            }

            gcd = greatestCommonDevider(deviders[i], deviders[i - 1]);
            lcm = leastCommonMultiple(deviders[i], deviders[i - 1], gcd);

            devidends[i - 1] *= lcm / deviders[i - 1];
            devidends[i] *= lcm / deviders[i];
            deviders[i] = lcm;
        }
        int totalDevident;


        totalDevident = deviders[deviders.length - 1];

        for (int i = 0; i < deviders.length; i++) {
            deviders[i] = totalDevident;
        }
        Task6S.sortShell(devidends);
    }

    private static int greatestCommonDevider(int a, int b) {
        int buffer;
        while (b != 0) {
            buffer = b;
            b = a % b;
            a = buffer;
        }
        return a;
    }

    private static int leastCommonMultiple(int a, int b, int gcd) {
        return Math.abs(a * b) / gcd;
    }
}
