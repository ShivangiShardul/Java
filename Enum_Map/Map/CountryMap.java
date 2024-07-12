package Enum_Map.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CountryMap {
    public static void main(String[] args) {
        Map<String,String> countryMap = new HashMap<>();
        countryMap.put("Bharat","New Delhi");
        countryMap.put("China","Beijing");
        countryMap.put("France","Paris");
        countryMap.put("Italy","Rome");
        countryMap.put("Canada","Ottawa");
        countryMap.put("Peru","Lima");
        countryMap.put("Australia","Canberra");
        countryMap.put("Vanuatu","Port Villa");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the country name : ");
        String country = input.next();

        if (countryMap.containsKey(country)){
            System.out.printf("Capital of %s is %s",country,countryMap.get(country));
        }else {
            System.out.println("Sorry we don't know the capital");
        }
    }
}
