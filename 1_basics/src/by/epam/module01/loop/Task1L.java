package by.epam.module01.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1L {

    public static int getSumOfSequence() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int retValue = 0;
        try {
            System.out.println("Введите целое положительное число");
            int num = Integer.parseInt(reader.readLine());
            if (num < 0) {
                return 0;
            }
            for (int i = num; i > 0; i--) {
                retValue += i;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
        return retValue;
    }

}
