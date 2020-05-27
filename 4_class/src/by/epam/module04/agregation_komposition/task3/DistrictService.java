package by.epam.module04.agregation_komposition.task3;

public class DistrictService {

    private District[] districts;
    private City regionCity;

    public DistrictService(District[] districts, City regionCity) {
        this.districts = districts;
        this.regionCity = regionCity;
    }

    public int getAreaOfDistricts() {
        int outArea = 0;

        for (District district : districts) {
            if (this.regionCity.equals(district.getDistrictCity())) {
                continue;
            }
            outArea += getDistrictArea(district);
        }

        return outArea;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    public void setRegionCity(City regionCity) {
        this.regionCity = regionCity;
    }

    private int getDistrictArea(District district) {
        int outArea = 0;

        outArea += district.getDistrictCity().getArea();
        for (int i = 0; i < district.getCities().length; i++) {
            outArea += district.getCities()[i].getArea();
        }

        return outArea;
    }
}
