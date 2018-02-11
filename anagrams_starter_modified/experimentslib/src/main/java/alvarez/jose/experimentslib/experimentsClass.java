package alvarez.jose.experimentslib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class experimentsClass {

    public static void main(String[] args) {

        // First things first...
        System.out.println("HELLO WORLD!!!");


        // GENERAL EXPERIMENTAL CODE FOR GETTING IDEAS and UNDERSTANDING BASIC STRUCTURES

        // How a HASH MAP works
        HashMap<String,String> countriesMap = new HashMap<>(); // Either of the values could be a string or an integer or other object
        countriesMap.put("GTM", "Guatemala");
        countriesMap.put("USA", "United States");
        countriesMap.put("GBR", "United Kingdom of Great Britain and Norther Ireland");

        String aCountryName = countriesMap.get("GTM");
        System.out.println("\nExperimenting with HashMaps: ");
        System.out.println("GTM returns " + countriesMap.get("GTM"));
        System.out.println("countriesMap contains \"United States\"? " + countriesMap.containsValue("United States"));
        System.out.println("countriesMap contains \"San Francisco\"? " + countriesMap.containsValue("San Francisco"));


        // TRICKS WITH ARRAY LISTS
        System.out.println("\n Experimenting with Hash Maps and Array Lists:");
        HashMap<String, ArrayList<String>> countriesToCities = new HashMap<>();
        ArrayList<String> citiesOfUSA = new ArrayList<>();
        citiesOfUSA.add("San Francisco");
        citiesOfUSA.addAll(Arrays.asList("New York", "Miami", "Los Angeles", "Orlando"));
        countriesToCities.put("United States", citiesOfUSA);
        String USA_NAME = "United States";
        System.out.println("Cities of " + USA_NAME + ": " + countriesToCities.get(USA_NAME));


        // TRICKS WITH ARRAYS...
        System.out.println("\nExperimenting with chars and arrays and for each loops");
        char[] vowels = "aeiou".toCharArray();
        String myName = "Jose";
        for(char aVowel: vowels) {
            if (myName.contains(String.valueOf(aVowel))) {
                System.out.println("My name " + myName + " contains " + aVowel);
            }
        }








        // EXPERIMENTAL CODE FOR GETTING IDEAS FOR MILESTONE 1


    }
}
