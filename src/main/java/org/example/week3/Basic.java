package org.example.week3;

public class Basic {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        for(Week day : Week.values()){
            System.out.println(day);
        }
        System.out.println(week);
    }
}
