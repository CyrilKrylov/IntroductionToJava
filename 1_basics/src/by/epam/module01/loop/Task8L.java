package by.epam.module01.loop;

/*Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры*/

public class Task8L {

    public static void showEqualDigits(final int m,final int n) {
        int inpFirstNumber = m;
        boolean outerFlag = true;
        do {
            if (outerFlag) {
                outerFlag = false;
            } else {
            	inpFirstNumber /= 10;
            }
            int inpSecondNumber = n;
            int lastDig = inpFirstNumber % 10;
            boolean flag = true;
            do {
                if (flag) {
                    flag = false;
                } else {
                	inpSecondNumber /= 10;
                }
                int innerSecDig = inpSecondNumber % 10;
                if (lastDig == innerSecDig) {
                    System.out.println(lastDig + " совпадающее число");
                }
            } while (inpSecondNumber / 10 != 0);
        }
        while (inpFirstNumber / 10 != 0);
    }

}
