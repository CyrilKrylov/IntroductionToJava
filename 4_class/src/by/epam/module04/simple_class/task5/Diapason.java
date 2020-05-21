package by.epam.module04.simple_class.task5;

public class Diapason {
	private int from;
	private int to;
	
	public Diapason() {
		super();
		this.from = -100;
		this.to = 100;
	}
	
	public Diapason(int from, int to) {
		super();
		this.from = from;
		this.to = to;
	}
	
	
	
	public boolean isInDiapason(int value) {
		return value >= this.from && value <= this.to;
	}
	
	
}
