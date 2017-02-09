package com.example.dfreeman.donscleanarchitectureexample.repository;

import com.example.dfreeman.donscleanarchitectureexample.entity.DonsObject;
import com.example.dfreeman.donscleanarchitectureexample.entity.OtherEntity;

public class DonsObjectRepository {
    private DonsObject testDonsObject;
    private OtherEntity testOtherEntity;

    public DonsObjectRepository() {
        testDonsObject = new DonsObject("TestOne", 1);
        testOtherEntity = new OtherEntity();
    }

    //Getters
    public DonsObject getTestDonsObject() {
        return testDonsObject;
    }
    public OtherEntity getTestOtherEntity() {
        return testOtherEntity;
    }
}
