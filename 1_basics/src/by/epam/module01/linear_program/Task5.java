package by.epam.module01.linear_program;

/*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc*/

public class Task5 {

	public static String getFormatedTime(int seconds) {
		if (seconds < 0) {
			return "Неверный формат исходных данных: введено отрицательное значение";
		}

		int hours;

		hours = seconds / 3600;

		return String.format("%02dч %02dмин %02dс", hours, (seconds - hours * 3600) / 60, seconds % 60);
	}

}
