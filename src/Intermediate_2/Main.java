package Intermediate_2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Continue with the same ArrayList and try some methods
 *
 *     Write a Java program to update specific array element by given element.
 *
 *     Write a Java program to remove the third element from a array list.
 *
 *     Sort the elements of the list, then reverse the order
 *
 *     Discuss the subject with the group: what does it means to order a list of “things” - what are the criteria
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

        cities.set(2, "Krems");

        System.out.println(cities);

        cities.remove(2);

        System.out.println(cities);

        Collections.sort(cities);
        Collections.reverse(cities);

        System.out.println(cities);
    }
}
