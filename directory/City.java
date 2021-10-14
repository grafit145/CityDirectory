package directory;

public class City {
    private int id;
    private String name;
    private String region;
    private String district;
    private int population;
    private String foundation;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }



   /* public City(int id, String name, String region, String district, int population, String foundation) {
        this.id = id;
        this.name = name;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
        this.region = region;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }
    @Override
    public String toString(){
        return "ID: " + getId() + ", " + "name=" + getName() + ", " + "region=" + getRegion() + ", " +
                "district=" + getDistrict() + ", " + "population=" +
                getPopulation() + ", " + "foundation=" + getFoundation();
    }
}
