package com.company;

public class Dancer extends Person {
    String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String toString() {
        return name + " " + designation + " " + groupName;
    }

    public void dancing() {
        System.out.println("Tansuet...");

    }
}
