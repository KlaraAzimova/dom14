package com.company;

public class Singer extends Person {
    String Name;


    public Singer(String name, String designation, String name1) {
        super(name, designation);
        Name = name1;
    }


    public String toString() {
        return name + " " + designation + " " + name;
    }

    public void singing() {
        System.out.println("Diana is singing!");

    }

    public void playGitar() {
        System.out.println("Playing the gitar!");


    }
}