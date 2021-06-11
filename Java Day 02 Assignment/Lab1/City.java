package Lab1;

public class City implements Comparable<City> {
    private String name, continent, id, country;
    private String population;
    private boolean capital;

    public City(String name, String continent, String country, String id, String population, boolean capital) {
        this.name = name;
        this.continent = continent;
        this.country = country;
        this.id = id;
        this.population = population;
        this.capital = capital;
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

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPopulation() {
        return this.population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public boolean isCapital() {
        return this.capital;
    }

    public boolean getCapital() {
        return this.capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    public int compareTo(City c) {
        return this.getPopulation().compareTo(c.getPopulation());
    }
}
