package com.example.dfreeman.donscleanarchitectureexample.entity;

import java.util.ArrayList;

public class InfoProvider {

    private ArrayList<DonsObject> sampleObjects = new ArrayList<>();

    public InfoProvider() {
        sampleObjects.add(new DonsObject("ObjectOne", 1));
        sampleObjects.add(new DonsObject("ObjectTwo", 2));
    }

    public ArrayList<DonsObject> getSampleObjects() {
        return sampleObjects;
    }
}
