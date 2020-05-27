package by.epam.module04.agregation_komposition.task3;

public class District {

    private City districtCity;
    private City[] cities;

    public District(City districtCity, City[] cities) {
        this.districtCity = districtCity;
        this.cities = cities;
    }

    public City getDistrictCity() {
        return districtCity;
    }

    public City[] getCities() {
        return cities;
    }
}
