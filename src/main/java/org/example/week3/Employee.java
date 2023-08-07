package org.example.week3;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee>{
    private Integer id;
    private String name;
    private String email;
    private LocalDate dateOfBirth;



    //Getters and Setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public int compareTo(Employee e) {
        return this.getName().compareTo(e.getName());
    }

//    Collections.sort(List, Comparator<Employee>());

}
