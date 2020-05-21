package by.epam.module04.simple_class.task5;

public class Main {
	
	public static void main(String[] args) {
		DecimalCounter decimalCounter = new DecimalCounter();
		decimalCounter.increaseCounterValue();
		decimalCounter.increaseCounterValue();
		System.out.println(decimalCounter.getCounterValue());
		decimalCounter.decreaseCounterValue();
		decimalCounter.decreaseCounterValue();
		decimalCounter.decreaseCounterValue();
		decimalCounter.decreaseCounterValue();
		System.out.println(decimalCounter.getCounterValue());
		
		DecimalCounter decimalCounter1 = new DecimalCounter(6,new Diapason(0,7));
		if(!decimalCounter1.increaseCounterValue()) {
			System.out.println("Вы достигли максимального значения счетчика");
		}else {
			System.out.println(decimalCounter1.getCounterValue());
		}
		if(!decimalCounter1.increaseCounterValue()) {
			System.out.println("Вы достигли максимального значения счетчика");
		}else {
			System.out.println(decimalCounter1.getCounterValue());
		}
	}
	
}
