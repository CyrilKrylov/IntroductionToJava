package by.epam.module01.loop;

import java.math.BigInteger;

public class Task4L {

    public static String getMultOfSquares() {
        BigInteger outMul = BigInteger.valueOf(1L);
        for (long i = 1; i <= 200 ; i++) {
            outMul = outMul.multiply(BigInteger.valueOf(i*i));
        }
        return outMul.toString();
    }

}
