package by.epam.module04.simple_class.task5;

/*ќпишите класс, реализующий дес€тичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. ѕредусмотрите инициализацию счетчика значени€ми по умолчанию и
произвольными значени€ми. —четчик имеет методы увеличени€ и уменьшени€ состо€ни€, и метод позвол€ющее
получить его текущее состо€ние. Ќаписать код, демонстрирующий все возможности класса*/

public class DecimalCounter {
	
	private int counterValue;
	private Diapason diapason;
	
	public DecimalCounter() {
		super();
		this.counterValue = 0;
		this.diapason = new Diapason();
	}
	
	public DecimalCounter(int counterValue, Diapason diapason) {
		super();
		this.counterValue = counterValue;
		this.diapason = diapason;
	}
	
	public boolean increaseCounterValue() {
		if(this.diapason.isInDiapason(counterValue+1)) {
			counterValue++;
			return true;
		}
		return false;
	}
	
	public boolean decreaseCounterValue() {
		if(this.diapason.isInDiapason(counterValue-1)) {
			counterValue--;
			return true;
		}
		return false;
	}
	
	public int getCounterValue() {
		return this.counterValue;
	}
	
}
