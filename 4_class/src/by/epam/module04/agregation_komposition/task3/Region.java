package by.epam.module04.agregation_komposition.task3;

public class Region {

    private City regionalCity;
    private District[] districts;

    public Region(City regionalCity, District[] districts) {
        this.regionalCity = regionalCity;
        this.districts = districts;
    }

    public City getRegionalCity() {
        return regionalCity;
    }

    public District[] getDistricts() {
        return districts;
    }
}
