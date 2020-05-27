package by.epam.module04.agregation_komposition.task3;

public class RegionService {

    private Region[] regions;
    private City capital;
    private DistrictService districtService;

    public RegionService(Region[] regions, City capital) {
        this.regions = regions;
        this.districtService = new DistrictService(regions[0].getDistricts(),regions[0].getRegionalCity());
        this.capital = capital;
    }

    public int getAreaOfRegions() {
        int outArea = 0;

        for (Region region : regions) {
            if (this.capital.equals(region.getRegionalCity())) {
                continue;
            }
            outArea += getRegionArea(region);
        }
        return outArea;
    }


    public void showRegionalCityNames() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < regions.length - 1; i++) {
            sb.append(regions[i].getRegionalCity().getCityName()).append(", ");
        }
        sb.append(regions[regions.length - 1].getRegionalCity().getCityName()).append("]");
        System.out.println(sb);
    }

    private int getRegionArea(Region region) {

        int outArea = region.getRegionalCity().getArea();
        this.districtService.setDistricts(region.getDistricts());
        this.districtService.setRegionCity(region.getRegionalCity());
        outArea += districtService.getAreaOfDistricts();
        return outArea;
    }
}
