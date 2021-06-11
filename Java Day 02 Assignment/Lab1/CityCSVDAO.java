package Lab1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CityCSVDAO {

    public List<City> readFromCSV(String filePath) {
        List<City> Citys = new ArrayList<City>();
        City c1;
        File CityInfo = new File(filePath);
        List<String> lines = new ArrayList<String>();
        try {
            lines = Files.readAllLines(CityInfo.toPath());
        } catch (IOException e) {
            System.out.println("Cannot Read file");
        }

        for (int lineInd = 1; lineInd < lines.size(); lineInd++) {
            String line = lines.get(lineInd);
            String[] fields = line.split(",");
            c1 = createCity(fields);

            Citys.add(c1);
        }
        return Citys;
    }

    public static City createCity(String[] data) {
        boolean d5 = Boolean.parseBoolean(data[5]);
        City c = new City(data[0], data[1], data[2], data[3], data[4], d5);
        return c;

    }
}
