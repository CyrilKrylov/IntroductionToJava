package by.epam.module04.agregation_komposition.task3;

public class State {

    private City capital;
    private Region[] regions;

    public State(City capital, Region[] regions) {
        this.capital = capital;
        this.regions = regions;
    }

    public City getCapital() {
        return capital;
    }

    public Region[] getRegions() {
        return regions;
    }
}
