package by.epam.module04.simple_class.task1;

/*�������� ����� Test1 ����� �����������. �������� ����� ������ �� ����� � ������
��������� ���� ����������. �������� �����, ������� ������� ����� �������� ���� 
����������, � �����, ������� ������� ���������� �������� �� ���� ���� ����������*/

public class Test1{

	private int firstValue;
	private int secondValue;
	
	public static void main(String[] args){
		  Test1 test = new Test1();
		  test.setFirstValue(12);
		  test.setSecondValue(123);
		  test.showFirstValue();
		  test.showSecondValue();
		  System.out.println(test.sum());
		  System.out.println(test.max());
	  }
	
	public void showFirstValue() {
		System.out.println(this.firstValue);
	}
	
	public void showSecondValue() {
		System.out.println(this.secondValue);
	}
	
	public void setFirstValue(int firstValue) {
		this.firstValue = firstValue;
	}
	
	public void setSecondValue(int secondValue) {
		this.secondValue = secondValue;
	}
	
	public int sum() {
		return this.firstValue + this.secondValue;
	}
	
	public int max() {
		return this.firstValue>this.secondValue?this.firstValue:this.secondValue;
	}
	
}
