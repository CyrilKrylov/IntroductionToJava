package by.epam.module04.simple_class.task4;

public class DepartureTime {
	
	private int hours;
	private int minutes;
	
	public DepartureTime(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}
	
	public int getHours() {
		return this.hours;
	}
	
	public int getMinutes() {
		return this.minutes;
	}
	
	public String toString() {
		return this.hours + ":" + this.minutes;
	}

}
