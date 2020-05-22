package by.epam.module04.simple_class.task10;

public class DepartureTime {

	private int hour;
	private int minute;


	public DepartureTime(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}

	public boolean isAfter(DepartureTime departureTime) {
		if (this.hour > departureTime.hour) {
			return true;
		} else if (this.hour == departureTime.hour) {
			return this.minute > departureTime.minute;
		}
		return false;
	}
}
