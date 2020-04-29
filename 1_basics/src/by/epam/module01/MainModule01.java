package by.epam.module01;

import by.epam.module01.branching.*;
import by.epam.module01.linear_program.*;
import by.epam.module01.loop.*;

public class MainModule01 {

	public static void main(String[] args) {
        out(Task1.getZ(6, 2, 5));
        out(Task2.getValueOfExpressionWithRoot(8, 21, 1));
        out(Task3.getValueOfTrigonometricExpression(30,60));
        out(Task4.getReversedDouble(111.222));
        out(Task5.getFormatedTime(3660));
        out(Task6.isInArea(2,4));
        out(Task1B.isTriangle(90,91));
        out(Task2B.getMaxOfMins(4,2,3,2));
        out(Task3B.isOnSingleLine(-3,5,2,4,2,14));
        out(Task4B.doesBrickFit(5,6,6,6,1));
        out(Task5B.getFunctionValue(2));
        out(Task1L.getSumOfSequence());
        Task2L.getFunctionValues(1,5,1);
        out(Task3L.getSumOfSquares());
        out(Task4L.getMultOfSquares());
        out(Task5L.getSum(0.1));
        out(Task6L.getCorrespondingInteger('~'));
        Task7L.getDeviders(5,100);
        Task8L.showEqualDigits(12345,33456);
    }

    private static void out(Number number) {
        System.out.println(number);
    }
    private static void out(String str) {
        System.out.println(str);
    }
    private static void out(boolean bool) {
        System.out.println(bool);
    }
	
}
