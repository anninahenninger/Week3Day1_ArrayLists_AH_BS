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

    public void compareNames(String direction){
        if(direction.equals("ascending")){
            Collections.sort(capitals, new Comparator<City>() {
                @Override
                public int compare(City o1, City o2) {
                    return o1.name.compareTo(o2.name);
                }
            });
            System.out.println("SORT NAME ASCENDING");
            for(int i = 0; i < capitals.size(); i++){
                System.out.println("City name: " + capitals.get(i).name + " " + capitals.get(i).citizensNum);
            }
        } else if (direction.equals("descending")){
            Collections.sort(capitals, new Comparator<City>() {
                @Override
                public int compare(City o1, City o2) {
                    return -(o1.name.compareTo(o2.name));
                }
            });
            System.out.println("SORT NAME DESCENDING");
            for(int i = 0; i < capitals.size(); i++){
                System.out.println("City name: " + capitals.get(i).name + " " + capitals.get(i).citizensNum);
            }
        } else {
            System.out.println("Direction can only be ascending or descending!");
        }
    }

    public void compareCitizens(String direction){
        if(direction.equals("ascending")){
            Collections.sort(capitals, new Comparator<City>() {
                @Override
                public int compare(City o1, City o2) {
                    return Integer.valueOf(o1.citizensNum).compareTo(o2.citizensNum);
                }
            });
            System.out.println("SORT CITIZENS ASCENDING");
            for(int i = 0; i < capitals.size(); i++){
                System.out.println("City name: " + capitals.get(i).name + " " + capitals.get(i).citizensNum);
            }
        } else if (direction.equals("descending")){
            Collections.sort(capitals, new Comparator<City>() {
                @Override
                public int compare(City o1, City o2) {
                    return -(Integer.valueOf(o1.citizensNum).compareTo(o2.citizensNum));
                }
            });
            System.out.println("SORT CITIZENS DESCENDING");
            for(int i = 0; i < capitals.size(); i++){
                System.out.println("City name: " + capitals.get(i).name + " " + capitals.get(i).citizensNum);
            }
        } else {
            System.out.println("Direction can only be ascending or descending!");
        }
    }
}