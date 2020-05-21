package by.epam.module04.simple_class.task6;

/*Составьте описание класса для представления времени. Предусмотрте возможности установки времени и 
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. 
В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения 
времени на заданное количество часов, минут и секунд. */

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		
	}

	public Time(int hour, int minute, int second) {
		super();
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public void setHour(int hour) {
		if(hour <= 23 && hour >= 0) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}
	}
	
	public void setMinute(int minute) {
		if(minute <= 59 && minute >= 0) {
			this.minute = minute;
		} else {
			this.minute = 0;
		}
	}
	
	public void setSecond(int second) {
		if(second <= 59 && second >= 0) {
			this.second = second;
		} else {
			this.second = 0;
		}
	}
	
	public void increaseOnHours(int hours) {
		int newHour;
		int sumOfHours;
		
		sumOfHours = this.hour + hours;
		
		if(sumOfHours>23) {
			newHour = sumOfHours%24;
			this.hour = newHour;
		}else {
			this.hour = sumOfHours;
		}
	}
	
	public void increaseOnMinutes(int minutes) {
		int newMinute;
		int newHour;
		int sumOfMinutes;		
		
		sumOfMinutes = this.minute + minutes;
		if(sumOfMinutes > 59) {
			newHour = sumOfMinutes/60;
			newMinute = sumOfMinutes%60;
			increaseOnHours(newHour);
			this.minute = newMinute;
		}else {
			this.minute = sumOfMinutes;
		}		
	}
	
	public void increaseOnSeconds(int seconds) {
		int newSecond;
		int newMinute;
		int sumOfSeconds;		
		
		sumOfSeconds = this.second + seconds;
		if(sumOfSeconds > 59) {
			newMinute = sumOfSeconds/60;
			newSecond = sumOfSeconds%60;
			increaseOnMinutes(newMinute);
			this.second = newSecond;
		}else {
			this.second = sumOfSeconds;
		}		
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}
	
	
	
}
