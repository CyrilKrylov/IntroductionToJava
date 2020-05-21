package by.epam.module04.simple_class.task3;

/*�������� ����� � ������ Student, ���������� ����: ������� � ��������, ����� ������,
������������ (������ �� ���� ���������). �������� ������ �� ������ ��������� ������ ����.
�������� ����������� ������ ������� � ������� ����� ���������, ������� ������, ������ 
������ 9 ��� 10*/

public class Student {
	
	private String lastNameAndInitials;
	private int groupNumber;
	private int[] academicPerfomance;
	
	public static void main(String[] args){
		 Student[] students = new Student[10];
		 students[0] = new Student("������� �.�.",3,new int[] {5,6,6,8,5});
		  students[1] = new Student("���� �.�.",5,new int[] {8,6,9,8,10});
		  students[2] = new Student("������� �.�.",6,new int[] {9,9,9,10,10});
		  students[3] = new Student("����� �.�.",3,new int[] {9,9,3,10,10});
		  students[4] = new Student("����� �.�.",6,new int[] {9,9,9,10,9});
		  students[5] = new Student("������ �.�.",6,new int[] {9,9,5,10,10});
		  students[6] = new Student("����� �.�.",6,new int[] {9,9,9,6,10});
		  students[7] = new Student("������ �.�.",6,new int[] {9,9,8,10,10});
		  students[8] = new Student("������ �.�.",6,new int[] {9,10,9,10,10});
		  students[9] = new Student("������ �.�.",6,new int[] {9,9,5,10,10});
		  
		  for(Student student : students) {
			  student.showLastNameAndGroupNumber();
		  }
	}
	
	public Student(String lastNameAndInitials, int groupNumber,int[] academicPerfomance) {
		this.lastNameAndInitials = lastNameAndInitials;
		this.groupNumber = groupNumber;
		this.academicPerfomance = academicPerfomance;
	}
	
	public void showLastNameAndGroupNumber() {
		if(this.isExcellentStudent()) {
			System.out.println("���: "+this.lastNameAndInitials+"; ����� ������: "+this.groupNumber);
		}
	}
	
	private boolean isExcellentStudent() {
		for(int  i= 0 ;i < this.academicPerfomance.length ;i++) {
			if(this.academicPerfomance[i]<9) {
				return false;
			}
		}
		return true;
	}
	
	
}
