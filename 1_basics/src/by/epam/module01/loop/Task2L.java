package by.epam.module01.loop;

/*Вычислить значения функции на отрезке [а,b] c шагом h:*/

public class Task2L {

	public static void getFunctionValues(double a, double b, double h) {
		double outvalue;
		if (a >= b) {
			System.out.println("Данные введены неверно: a>=b");
			return;
		}
		for (double i = a; i <= b; i += h) {
			if (i <= 2) {
				outvalue = -i;
			} else {
				outvalue = i;
			}
			System.out.println("Значение функции равно" + outvalue);
		}
	}
}
