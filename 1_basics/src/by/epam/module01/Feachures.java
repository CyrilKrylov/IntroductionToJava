package by.epam.module01;

public class Feachures {

    public static void getFeachures() {
        System.out.println(Double.MIN_VALUE);
        // Возвращает представление заданного значения с плавающей точкой в соответствии с IEEE 754
        long lbits = Double.doubleToLongBits(-0.06);
        long lsign = lbits >>> 63; // знак
        long lexp = (lbits >>> 52 & ((1 << 11) - 1)) - ((1 << 10) - 1); // порядок
        long lmantissa = lbits & ((1L << 52) - 1); // мантисса
        System.out.println(lsign + " " + lexp + " " + lmantissa);
        System.out.println(Double.longBitsToDouble((lsign << 63) | (lexp + ((1 << 10) - 1)) << 52 | lmantissa));
    }

}
