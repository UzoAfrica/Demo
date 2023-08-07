package org.example.week3;



import java.util.*;

class Country {
    private String name;
    private int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }
}

public class testing {
    public static void main(String[] args) {
        PriorityQueue<Country> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(Country::getPopulation).reversed());

        // Add countries to the priority queue
        priorityQueue.offer(new Country("India", 13934));
        priorityQueue.offer(new Country("China", 14442));
        priorityQueue.offer(new Country("United States", 3329));
        priorityQueue.offer(new Country("Indonesia", 2763));
        priorityQueue.offer(new Country("Pakistan", 2251));


        // Group countries based on their population in descending order
        Map<Integer, List<Country>> populationGroups = new HashMap<>();
        while (!priorityQueue.isEmpty()) {
            Country country = priorityQueue.poll();
            int population = country.getPopulation();

            List<Country> countries = populationGroups.getOrDefault(population, new ArrayList<>());
            countries.add(country);
            populationGroups.put(population, countries);
        }

// Print the grouped countries in descending order of population
        List<Integer> sortedPopulations = new ArrayList<>(populationGroups.keySet());
        Collections.sort(sortedPopulations, Collections.reverseOrder());

        for (int population : sortedPopulations) {
            List<Country> countries = populationGroups.get(population);
            System.out.println("Countries with population " + population + ":");
            for (Country country : countries) {
                System.out.println(country.getName());
            }
            System.out.println();
        }


//        // Group countries based on their population
//        Map<Integer, List<Country>> populationGroups = new HashMap<>();
//        while (!priorityQueue.isEmpty()) {
//            Country country = priorityQueue.poll();
//            int population = country.getPopulation();
//            populationGroups.computeIfAbsent(population, k -> new ArrayList<>()).add(country);
//        }

        // Print the grouped countries
//        for (Map.Entry<Integer, List<Country>> entry : populationGroups.entrySet()) {
//            int population = entry.getKey();
//            List<Country> countries = entry.getValue();
//            System.out.println("Countries with population " + population + ":");
//            for (Country country : countries) {
//                System.out.println(country.getName());
//            }
//            System.out.println();
//        }
    }
}


//    import java.util.*;
//
//    class Country {
//        private String name;
//        private int population;
//
//        public Country(String name, int population) {
//            this.name = name;
//            this.population = population;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public int getPopulation() {
//            return population;
//        }
//    }
//
//    public class testing {
//        public static void main(String[] args) {
//            PriorityQueue<Country> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(Country::getPopulation).reversed());
//
//            // Add countries to the priority queue
//            priorityQueue.offer(new Country("India", 139));
//            priorityQueue.offer(new Country("China", 144));
//            priorityQueue.offer(new Country("United States", 332));
//            priorityQueue.offer(new Country("Indonesia", 276));
//            priorityQueue.offer(new Country("Pakistan", 225));
//
//            // Group countries based on their population
//            Map<Integer, List<Country>> populationGroups = new HashMap<>();
//            while (!priorityQueue.isEmpty()) {
//                Country country = priorityQueue.poll();
//                int population = country.getPopulation();
//                populationGroups.computeIfAbsent(population, k -> new ArrayList<>()).add(country);
//            }
//
//            // Print the grouped countries
//            for (Map.Entry<Integer, List<Country>> entry : populationGroups.entrySet()) {
//                int population = entry.getKey();
//                List<Country> countries = entry.getValue();
//                System.out.println("Countries with population " + population + ":");
//                for (Country country : countries) {
//                    System.out.println(country.getName());
//                }
//                System.out.println();
//            }
//        }

