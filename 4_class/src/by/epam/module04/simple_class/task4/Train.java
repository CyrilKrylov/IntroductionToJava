package by.epam.module04.simple_class.task4;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда,
время отправления. Создайте данные в массив из пяти элементов типа Train, 
добавьте возможность сортировки элементов массива по номерам поездов. Добавьте возможность 
вывода информации о поезде, номер которого введен пользователем. Добавьте возможность 
сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения 
должны быть упорядочены по времени отправления*/

public class Train {

	private String destinationName;
	private int trainNumber;
	private DepartureTime departureTime;
	
	public Train(String destinationName, int trainNumber, DepartureTime departureTime) {
		this.destinationName = destinationName;
		this.trainNumber = trainNumber;
		this.departureTime = departureTime;
	}
	
	public String getDestinationName() {
		return this.destinationName;
	}
	
	public int getTrainNumber() {
		return this.trainNumber;
	}
	
	public DepartureTime getDepartureTime() {
		return this.departureTime;
	}

	@Override
	public String toString() {
		return "Train [destinationName=" + destinationName + ", trainNumber=" + trainNumber + ", departureTime="
				+ departureTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destinationName == null) ? 0 : destinationName.hashCode());
		result = prime * result + trainNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destinationName == null) {
			if (other.destinationName != null)
				return false;
		} else if (!destinationName.equals(other.destinationName))
			return false;
		if (trainNumber != other.trainNumber)
			return false;
		return true;
	}
	
	
}
