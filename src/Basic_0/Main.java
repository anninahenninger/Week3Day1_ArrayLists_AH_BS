package Basic_0;

import java.util.*;

/**
 * Create a program to create a new array list, containing 6 String objects with names of Austrian cities and print out
 * the collection.
 *
 *     Then, create a new ArrayList containing current temperatures (in Celsius) in this cities. Print out this second
 *     collection.
 *
 *     Try to join the data from those two array list in a single object of the class City. add those object to the
 *     array list, and then print the collection.
 */

public class Main {

    public static void main(String[] args) {
        String s1 = "Salzburg";
        String s2 = "Wien";
        String s3 = "Klagenfurt";
        String s4 = "Graz";
        String s5 = "Bregenz";
        String s6 = "Linz";

        ArrayList<String> cities = new ArrayList<>();
        cities.add(s1);
        cities.add(s2);
        cities.add(s3);
        cities.add(s4);
        cities.add(s5);
        cities.add(s6);

        /*
        for(String city : cities){
            System.out.println(city);
        }

        ArrayList<Integer> temperatures = new ArrayList<>();
        Integer t1 = 15;
        Integer t2 = 20;
        Integer t3 = 17;
        Integer t4 = 19;
        Integer t5 = 14;
        Integer t6 = 21;
        temperatures.add(t1);
        temperatures.add(t2);
        temperatures.add(t3);
        temperatures.add(t4);
        temperatures.add(t5);
        temperatures.add(t6);

        for(Integer temperature : temperatures){
            System.out.println(temperature);
        }

        City c1 = new City(s1, t1);
        City c2 = new City(s2, t2);
        City c3 = new City(s3, t3);
        City c4 = new City(s4, t4);
        City c5 = new City(s5, t5);
        City c6 = new City(s6, t6);

        ArrayList<City> cityTemperature = new ArrayList<>();
        cityTemperature.add(c1);
        cityTemperature.add(c2);
        cityTemperature.add(c3);
        cityTemperature.add(c4);
        cityTemperature.add(c5);
        cityTemperature.add(c6);

        for(City ct : cityTemperature){
            System.out.println("The temperature in " + ct.city + " is " + ct.temperature + "°C");
        }
        */

        //A1

        Collections.sort(cities);

        System.out.println("###################");
        for(String city : cities){
            System.out.println(city);
        }

        ArrayList<String> villages = new ArrayList<>();

        String v1 = "Zwentendorf";
        String v2 = "Deutsch-Wagram";
        String v3 = "Lassee";
        villages.add(v1);
        villages.add(v2);
        villages.add(v3);


        for(String village : villages){
            System.out.println(village);
        }

        villages.addAll(cities);
        System.out.println("###################");
        for(String village : villages){
            System.out.println(village);
        }

        System.out.println("###################");
        for(int i = 0; i < villages.size(); i++){
            System.out.println(villages.get(i));
        }

        /*
        System.out.println("###################");
        if(villages.isEmpty()){
            System.out.println("Array is empty");
        } else {
            System.out.println("Array is not empty");
        }
        */

        /*
        Collections.reverse(villages);
        System.out.println("###################");
        for(String reverseVillages : villages){
            System.out.println(reverseVillages);
        }
         */

        /*
        villages.removeIf(h -> (h.equals("Lassee")));
        System.out.println("###################");
        for(String reverseVillages : villages){
            System.out.println(reverseVillages);
        }
        */

        villages.add(1, "Gänserndorf");
        System.out.println("###################");
        for(int i = 0; i < villages.size(); i++){
            System.out.println(villages.get(i));
        }
    }
}
