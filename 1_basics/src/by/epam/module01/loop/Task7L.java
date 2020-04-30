package by.epam.module01.loop;

/*Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры*/

public class Task7L {

    public static void getDeviders(int n, int m) {
        if (n >= m) {
            System.out.println("Неверно заданы значения: n>=m");
            return;
        }
        for (int i = n; i <= m; i++) {
            System.out.print("Делители числа " + i + ": ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
