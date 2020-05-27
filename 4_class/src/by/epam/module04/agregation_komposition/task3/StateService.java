package by.epam.module04.agregation_komposition.task3;

public class StateService {

    private State state;
    private RegionService regionService;

    public StateService(State state) {
        this.state = state;
        this.regionService = new RegionService(state.getRegions(), state.getCapital());
    }

    public void showCapital() {
        System.out.println(state.getCapital().getCityName());
    }

    public void showNumberOfRegions() {
        System.out.println(state.getRegions().length);
    }

    public void showArea() {
        int outArea = 0;

        outArea += state.getCapital().getArea();
        outArea += regionService.getAreaOfRegions();
        System.out.println(outArea);
    }

    public void showRegionalCityNames() {
        regionService.showRegionalCityNames();
    }
}
