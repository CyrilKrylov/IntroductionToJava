package by.epam.module04.simple_class.task2;

/*Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и
get- методы для полей экземпляра класса*/

public class Test2 {
	
	private int firstValue;
	private int secondValue;
	
	public static void main(String[] args){
		 
	}
	
	public Test2() {
		this.firstValue = 0;
		this.secondValue = 0;
	}
	
	public Test2(int firstValue,int secondValue) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
	}
	
	public void setFirstValue(int firstValue) {
		this.firstValue = firstValue;
	}
	public void setSecondValue(int secondValue) {
		this.secondValue = secondValue;
	}
	
	public int getFirstValue() {
		return this.firstValue;
	}
	
	public int getSecondtValue() {
		return this.secondValue;
	}
	
}
