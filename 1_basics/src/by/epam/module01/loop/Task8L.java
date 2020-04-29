package by.epam.module01.loop;

public class Task8L {

    public static void showEqualDigits(int firstDigit, int secondDigit) {
        int inpFirstDig = firstDigit;
        boolean outerFlag = true;
        do {
            if (outerFlag) {
                outerFlag = false;
            } else {
                inpFirstDig /= 10;
            }
            int inpSecondDigit = secondDigit;
            int lastDig = inpFirstDig % 10;
            boolean flag = true;
            do {
                if (flag) {
                    flag = false;
                } else {
                    inpSecondDigit /= 10;
                }
                int innerSecDig = inpSecondDigit % 10;
                if (lastDig == innerSecDig) {
                    System.out.println(lastDig + " совпадающее число");
                }
            } while (inpSecondDigit / 10 != 0);
        }
        while (inpFirstDig / 10 != 0);
    }

}
