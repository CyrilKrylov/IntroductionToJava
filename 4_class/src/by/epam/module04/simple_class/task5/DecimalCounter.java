package by.epam.module04.simple_class.task5;

/*������� �����, ����������� ���������� �������, ������� ����� ����������� ��� ��������� ���� ��������
�� ������� � �������� ���������. ������������� ������������� �������� ���������� �� ��������� �
������������� ����������. ������� ����� ������ ���������� � ���������� ���������, � ����� �����������
�������� ��� ������� ���������. �������� ���, ��������������� ��� ����������� ������*/

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
