package org.example.week3.countrypriorityQueue;

class Country {
    private String name;
    private long population;

    public Country(String name, long population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public long getPopulation() {
        return population;
    }
}
