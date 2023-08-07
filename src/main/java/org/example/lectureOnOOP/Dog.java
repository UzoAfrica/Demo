package org.example.lectureOnOOP;

public class Dog extends Animal {
   private String name;
    private String age;
    private String breed;


//    public String getName() {
//        return name;
//    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return age;
    }


    public void setAge(String age) {

        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void barking(){

        System.out.println("The dog is barking");
    }

        public void  eating() {
            System.out.println("The dog is eating");

           }

}
