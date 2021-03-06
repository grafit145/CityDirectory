package directory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.Socket;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("src/city/city_ru.csv"));

        String line = null;
        Scanner scanner = null;
        int index = 0;
        List<City> cityList = new ArrayList<>();

        while((line = reader.readLine()) != null){
            City city = new City();
            scanner = new Scanner(line);
            scanner.useDelimiter(";");
            while (scanner.hasNext()){
                scanner.skip("\\d*");
                String data = scanner.next();
                if(index == 0)
                    city.setName(data);
                else if(index == 1)
                    city.setRegion(data);
                else if(index == 2)
                    city.setDistrict(data);
                else if(index == 3)
                    city.setPopulation(Integer.parseInt(data));
                else if(index == 4)
                    city.setFoundation(data);
                else
                    System.out.println("Некорректные данные: " + data);
                index++;
            }
            index = 0;
            cityList.add(city);
        }
        reader.close();
        List<City> result = cityList.stream()
                .sorted(Comparator.comparing(city -> city.toString()))
                .sorted(Comparator.comparing(city -> city.getDistrict()))
                .collect(Collectors.toList());
        result.forEach(System.out::println);


    }
}
