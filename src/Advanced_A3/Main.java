package Advanced_A3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        City Wien = new City("Wien", 1800000);
        City St_Pölten = new City("St_Pölten", 52000);
        City Eisenstadt = new City("Eisenstadt", 13000);
        City Graz = new City("Graz", 266000);
        City Klagenfurt = new City("Klagenfurt", 94000);
        City Linz = new City("Linz", 192000);
        City Salzburg = new City("Salzburg", 146000);
        City Innsbruck = new City("Innsbruck", 122000);
        City Bregenz = new City("Bregenz", 28000);

        ArrayList<City> capitals = new ArrayList<>();

        capitals.add(Wien);
        capitals.add(St_Pölten);
        capitals.add(Eisenstadt);
        capitals.add(Graz);
        capitals.add(Klagenfurt);
        capitals.add(Linz);
        capitals.add(Salzburg);
        capitals.add(Innsbruck);
        capitals.add(Bregenz);

        /*
        for(City capital : capitals){
            System.out.println(capital.name + " " + capital.citizensNum);
        }
         */

        AustrianCities ac = new AustrianCities(capitals);
        //ac.printCityNames();
        //ac.printCityCitizenNumbers();
        //ac.printAllCityData();
        //ac.printTotalNumberOfCitizens();

        //ac.compareNames("ascending");
        ac.compareCitizens("ascending");
    }
}
