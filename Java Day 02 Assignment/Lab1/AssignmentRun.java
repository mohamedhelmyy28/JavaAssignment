package Lab1;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssignmentRun {

    public static void main(String[] args) {

        CountryCSVDAO countryDAO = new CountryCSVDAO();
        List<Country> countries = countryDAO.readFromCSV("countries.csv");
        CityCSVDAO cityDAO = new CityCSVDAO();
        List<City> cities = cityDAO.readFromCSV("cities.csv");
        Map<String, City> citiesOfCountry = new HashMap<>();
        Collections.sort(cities, Collections.reverseOrder());
        for (Country x : countries) {
            for (City y : cities) {
                if (y.getCountry() == x.getName())
                    citiesOfCountry.put(x.getId(), y);
            }
        }

    }

}
