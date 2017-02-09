package com.example.dfreeman.donscleanarchitectureexample.entity;

public class DonsObject {
    private String name;
    private int number;

    public DonsObject(String name, int number) {
        this.name = name;
        this.number = number;
    }

    //Getters
    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
