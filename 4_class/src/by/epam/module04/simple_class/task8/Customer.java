package by.epam.module04.simple_class.task8;

/*������� ����� Customer, ������������ �������� ��������� ����. ���������� ������������, set- � get- ������
        � ����� toString(). ������� ������ �����, ������������ ������ ���� Customer, � ����������� ��������������
        � ��������. ������ �������� ������ ������ � ������� ��� ������ �� �������.
        ����� Customer: id, �������, ���, ��������, �����, ����� ��������� ��������, ����� ����������� �����.
        ����� � �������:
        a) ������ ����������� � ���������� �������;
        b) ������ �����������, � ������� ����� ��������� �������� ��������� � �������� ���������*/

public class Customer {

    private int id;
    private String lastName;
    private String name;
    private String middleName;
    private String address;
    private int creditCardNumber;
    private int bankAccountNumber;

    public Customer() {
        defaultInitialization();
    }

    public Customer(int id, String lastName, String name, String middleName, String address, int creditCardNumber, int bankAccountNumber) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Customer{");
        sb.append("id=").append(id);
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", middleName='").append(middleName).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", creditCardNumber=").append(creditCardNumber);
        sb.append(", bankAccountNumber=").append(bankAccountNumber);
        sb.append('}');
        return sb.toString();
    }

    private void defaultInitialization() {
        this.id = 1;
        this.lastName = "�������";
        this.name = "�����";
        this.middleName = "�����������";
        this.address = "������������";
        this.creditCardNumber = 256256;
        this.bankAccountNumber = 333;
    }
}
