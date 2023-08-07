package org.example.week3.countrypriorityQueue;

import java.util.*;

public class CountryGroupingService {
    public static List<Country> arrangePopulationsDescending(List<Country> countries) {
        List<Country> arrangedCountries = new ArrayList<>(countries);

        for (int i = 0; i < arrangedCountries.size() - 1; i++) {
            for (int j = 0; j < arrangedCountries.size() - i - 1; j++) {
                Country currentCountry = arrangedCountries.get(j);
                Country nextCountry = arrangedCountries.get(j + 1);

                if (currentCountry.getPopulation() < nextCountry.getPopulation()) {
                    // Swap the countries
                    arrangedCountries.set(j, nextCountry);
                    arrangedCountries.set(j + 1, currentCountry);
                }
            }
        }

        return arrangedCountries;
    }
}

