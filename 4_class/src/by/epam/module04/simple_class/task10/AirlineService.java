package by.epam.module04.simple_class.task10;

import java.util.Arrays;

public class AirlineService {

	private Airline[] airlines;

	public AirlineService(Airline[] airlines) {
		this.airlines = airlines;
	}

	public Airline[] getAirlinesByDestination(String destination) {

		Airline[] airlinesByDestination;
		int arrayLength = 0;

		airlinesByDestination = new Airline[this.airlines.length];

		for (Airline airline : this.airlines) {
			if (airline.getDestination().equals(destination)) {
				airlinesByDestination[arrayLength++] = airline;
			}
		}

		return Arrays.copyOf(airlinesByDestination, arrayLength);
	}

	public Airline[] getAirlinesByDayOfWeek(DayOfWeek dayOfWeek) {
		Airline[] airlinesByDayOfWeek;
		int arrayLength = 0;

		airlinesByDayOfWeek = new Airline[this.airlines.length];

		for (Airline airline : this.airlines) {
			if (airline.containDayOfWeek(dayOfWeek)) {
				airlinesByDayOfWeek[arrayLength++] = airline;
			}
		}

		return Arrays.copyOf(airlinesByDayOfWeek, arrayLength);
	}

	public Airline[] getAirlinesByDayOfWeekAndDepTime(DayOfWeek dayOfWeek, DepartureTime departureTime) {
		Airline[] airlinesByDayOfWeek;
		int arrayLength = 0;
		Airline[] airlinesByDayOfWeekAndDepTime;

		airlinesByDayOfWeek = this.getAirlinesByDayOfWeek(dayOfWeek);
		airlinesByDayOfWeekAndDepTime = new Airline[airlinesByDayOfWeek.length];

		for (Airline airline : airlinesByDayOfWeek) {
			if (airline.getDepartureTime().isAfter(departureTime)) {
				airlinesByDayOfWeekAndDepTime[arrayLength++] = airline;
			}
		}

		return Arrays.copyOf(airlinesByDayOfWeekAndDepTime, arrayLength);

	}

}
