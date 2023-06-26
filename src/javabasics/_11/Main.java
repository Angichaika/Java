package javabasics._11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cityNames = Arrays.asList("Barcelona", "Rome", "Paris");

        // cityNames.add("Torino");
        //E' impossibile aggiungere elementi siccome la lista è immutabile.


        cityNames.set(1, "Tegucigalpa");
        System.out.println(cityNames);

        System.out.println("City names: " + cityNames);


        List<String> kingsOfRome = new ArrayList<>();

        // Insert the names of the 7 kings of Rome into the mutable list
        kingsOfRome.add("Romulus");
        kingsOfRome.add("Numa Pompilius");
        kingsOfRome.add("Tullus Hostilius");
        kingsOfRome.add("Ancus Marcius");
        kingsOfRome.add("Tarquinius Priscus");
        kingsOfRome.add("Servius Tullius");
        kingsOfRome.add("Lucius Tarquinius Superbus");


        System.out.println( kingsOfRome);


        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);

        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";

        System.out.println(Arrays.toString(kingsOfRomeArray));
    }
}


