package org.example.week3.countrypriorityQueue;


import java.util.ArrayList;
import java.util.List;

import static org.example.week3.countrypriorityQueue.CountryGroupingService.arrangePopulationsDescending;

public class CountryMain {
        public static void main(String[] args) {
            List<Country> countries = new ArrayList<>();
            countries.add(new Country("India", 13934));
            countries.add(new Country("China", 144421));
            countries.add(new Country("United States", 3329));
            countries.add(new Country("Indonesia", 2763));
            countries.add(new Country("Pakistan", 2251));

            // Arrange countries' populations in descending order
            List<Country> arrangedCountries = arrangePopulationsDescending(countries);

            // Print the arranged countries' populations
            for (Country country : arrangedCountries) {
                System.out.println(country.getName() + ": " + country.getPopulation());
            }
        }
}
