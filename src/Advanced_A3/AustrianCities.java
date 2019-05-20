package Advanced_A3;

import java.util.*;

public class AustrianCities{
    ArrayList<City> capitals;

    AustrianCities(ArrayList<City> capitals){
        this.capitals = capitals;
    }

    public void printCityNames(){
        capitals.forEach(city -> System.out.println(city.name));
    }
    public void printCityCitizenNumbers(){
        ListIterator<City> listIterator = capitals.listIterator();

        while(listIterator.hasNext()){
            System.out.println(listIterator.next().citizensNum);
        }
    }

    public void printAllCityData(){
        capitals.forEach(city -> System.out.println("The city " + city.name + " has " + city.citizensNum + " citizens!"));
    }

    public void printTotalNumberOfCitizens(){
        for(int i = 0; i < capitals.size(); i++){
            System.out.println(capitals.get(i).name + "\t" + capitals.get(i).citizensNum);
        }
        System.out.println("===========");
        int total = 0;
        for(int i = 0; i < capitals.size(); i++){
            total += capitals.get(i).citizensNum;
        }
        System.out.println("TOTAL " + total);
    }
}
