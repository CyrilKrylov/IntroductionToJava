package by.epam.module04.agregation_komposition.task3;

import java.util.Objects;

public class City {

    private String cityName;
    private int area;

    public City(String cityName, int area) {
        this.cityName = cityName;
        this.area = area;
    }

    public String getCityName() {
        return cityName;
    }

    public int getArea() {
        return area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return area == city.area &&
                cityName.equals(city.cityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName, area);
    }
}
