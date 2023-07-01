package 4_Programming_with_classes.aggregation_and_composition;

public class main3 {
    public static void main(String[] args) {
        City city1 = new City("City 1");
        City city2 = new City("City 2");
        City city3 = new City("City 3");

        District district1 = new District("District 1", city1);
        District district2 = new District("District 2", city2);

        Region region1 = new Region("Region 1", city1, 2);
        region1.addDistrict(district1, 0);
        region1.addDistrict(district2, 1);

        Region region2 = new Region("Region 2", city2, 1);
        region2.addDistrict(district1, 0);

        State state = new State("MyState", city3, 2);
        state.addRegion(region1, 0);
        state.addRegion(region2, 1);

        System.out.println("Столица: " + state.getCapital().getCityName());
 }
}
class City {
    private String cityName;

    public City(String name) {
        cityName = name;
    }

    public String getCityName() {
        return cityName;
    }
}

class District {
    private String districtName;
    private City districtCenter;

    public District(String name, City center) {
        districtName = name;
        districtCenter = center;
    }

    public String getDistrictName() {
        return districtName;
    }

    public City getDistrictCenter() {
        return districtCenter;
    }
}

class Region {
    private String regionName;
    private City regionalCenter;
    private District[] districts;

    public Region(String name, City center, int numDistricts) {
        regionName = name;
        regionalCenter = center;
        districts = new District[numDistricts];
    }

    public String getRegionName() {
        return regionName;
    }

    public City getRegionalCenter() {
        return regionalCenter;
    }

    public void addDistrict(District district, int index) {
        if (index >= 0 && index < districts.length) {
            districts[index] = district;
        }
    }
}

class State {
    private String stateName;
    private City capital;
    private Region[] regions;

    public State(String name, City capital, int numRegions) {
        stateName = name;
        this.capital = capital;
        regions = new Region[numRegions];
    }

    public String getStateName() {
        return stateName;
    }

    public City getCapital() {
        return capital;
    }

    public void addRegion(Region region, int index) {
        if (index >= 0 && index < regions.length) {
            regions[index] = region;
        }
    }

    public int getNumberOfRegions() {
        return regions.length;
    }

    public void printRegionalCentersArea() {
        for (Region region : regions) {
            City center = region.getRegionalCenter();
            System.out.println("Областной центр " + center.getCityName() + " площадь: ...");
        }
    }
}