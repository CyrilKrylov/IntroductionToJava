package by.epam.module02.decomposition;

/*Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
решения задачи использовать декомпозицию*/

public class Task13D {

    public static void main(String[] args) {
        showTwins(50);
    }


    private static void showTwins(int n) {
        if (n < 3) {
            System.out.println("Число меньше 3");
            return;
        }

        for (int i = n; i < 2 * n - 2; i++) {
            if (isPrimeNumber(i) && isPrimeNumber(i + 2)) {
                System.out.println(i + " - " + (i + 2));
            }
        }
    }

    private static boolean isPrimeNumber(int m) {
        for (int i = 2; i < m / 2; i++) {
            if (m % i == 0){
                return false;
            }
        }
        return true;
    }

}
