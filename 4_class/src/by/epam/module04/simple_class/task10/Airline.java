package by.epam.module04.simple_class.task10;

/* ������� ����� Airline, ������������ �������� ��������� ����. ���������� ������������, set- � get- ������
		  � ����� toString(). ������� ������ �����, ������������ ������ ���� Airline, � ����������� �������������� �
		  ��������. ������ �������� ������ ������ � ������� ��� ������ �� �������.
		  Airline: ����� ����������, ����� �����, ��� ��������, ����� ������, ��� ������.
		  ����� � �������:
		  a) ������ ������ ��� ��������� ������ ����������;
		  b) ������ ������ ��� ��������� ��� ������;
		  c) ������ ������ ��� ��������� ��� ������, ����� ������ ��� ������� ������ ���������.*/

import java.util.Arrays;
import java.util.Objects;

public class Airline {

	private String destination;
	private int flightNumber;
	private PlainType plainType;
	private DepartureTime departureTime;
	private DayOfWeek[] daysOfWeek;

	public Airline(){

	}

	public Airline(String destination, int flightNumber, PlainType plainType, DepartureTime departureTime, DayOfWeek[] daysOfWeek) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.plainType = plainType;
		this.departureTime = departureTime;
		this.daysOfWeek = daysOfWeek;
	}

	public boolean containDayOfWeek(DayOfWeek dayOfWeek) {
		for (DayOfWeek ofWeek : this.daysOfWeek) {
			if (ofWeek.equals(dayOfWeek)) {
				return true;
			}
		}
		return false;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public PlainType getPlainType() {
		return plainType;
	}

	public void setPlainType(PlainType plainType) {
		this.plainType = plainType;
	}

	public DepartureTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(DepartureTime departureTime) {
		this.departureTime = departureTime;
	}

	public DayOfWeek[] getDaysOfWeek() {
		return daysOfWeek;
	}

	public void setDaysOfWeek(DayOfWeek[] daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Airline airline = (Airline) o;
		return flightNumber == airline.flightNumber &&
				 destination.equals(airline.destination) &&
				 plainType == airline.plainType &&
				 departureTime.equals(airline.departureTime) &&
				 Arrays.equals(daysOfWeek, airline.daysOfWeek);
	}

	@Override
	public int hashCode() {
		int result = Objects.hash(destination, flightNumber, plainType, departureTime);
		result = 31 * result + Arrays.hashCode(daysOfWeek);
		return result;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer(this.getClass().getSimpleName());
		sb.append("{");
		sb.append("destination='").append(destination).append('\'');
		sb.append(", flightNumber=").append(flightNumber);
		sb.append(", plainType=").append(plainType);
		sb.append(", departureTime=").append(departureTime);
		sb.append(", daysOfWeek=").append(daysOfWeek == null ? "null" : Arrays.asList(daysOfWeek).toString());
		sb.append('}');
		return sb.toString();
	}
}
