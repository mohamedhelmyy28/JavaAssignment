package Lab1;

public class Country {
    private String name, continent, id;
    private int population;

    public Country(String name, String continent, String id, int population) {
        this.name = name;
        this.continent = continent;

        this.id = id;
        this.population = population;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return this.continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPopulation() {
        return this.population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

}
