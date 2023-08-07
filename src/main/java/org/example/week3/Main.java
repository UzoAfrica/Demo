package org.example.week3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names =
                Arrays.asList("Alex", "Charles", "Brian", "David");

//Prints - [Alex, Brian, Charles, David]
        Collections.sort(names);
        System.out.println(names);

//Prints - [David, Charles, Brian, Alex]
        Collections.sort(names, Collections.reverseOrder());
        System.out.println(names);


//        ArrayList<Employee> employees = new ArrayList<>();
//
////Narutal order sorting
//        Collections.sort(employees);
//        System.out.println(employees);
//
////Reverse sorting
//        Collections.sort(employees, Collections.reverseOrder());
//        System.out.println(employees);
//    }



        Comparator<Employee> compareById = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getId().compareTo(o2.getId());
            }
        };

        Comparator<Employee> compareByName = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };


    }

}
