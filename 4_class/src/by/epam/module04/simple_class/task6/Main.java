package by.epam.module04.simple_class.task6;

public class Main {

	public static void main(String[] args) {
		Time time  = new Time(10,20,25);
		
		time.increaseOnMinutes(60);
		time.increaseOnSeconds(60);
		System.out.println(time);
	}
	
	
	
}
