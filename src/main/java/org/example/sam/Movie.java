package org.example.sam;

import java.util.ArrayList;
import java.util.Collections;

public class Movie implements Comparable<Movie>{
    private double rating;
    private String name;
    private int year;

     public int compareTo(Movie m){
         return this.year - m.year;
     }

    public Movie(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie(8.3, "Force Awakens", 2015));
        list.add(new Movie(8.7,"Star Wars",   1977));
        list.add(new Movie(8.4, "Empire of Strikes back ", 1983));
        list.add(new Movie( 8.8,"The return of Jedi", 1983));

        Collections.sort(list);
        System.out.println("Movie after sorting : ");
        for (Movie movie: list){
            System.out.println(movie.getName() + " "+
                    movie.getRating() + " " +
                    movie.getYear());
        }
    }
}
