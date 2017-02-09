package com.example.dfreeman.donscleanarchitectureexample.repository;

import com.example.dfreeman.donscleanarchitectureexample.entity.DonsObject;
import com.example.dfreeman.donscleanarchitectureexample.entity.InfoProvider;

import java.util.ArrayList;

public class DonsObjectRepository {

    public ArrayList<String> getAllNames() {
        InfoProvider infoProvider = new InfoProvider();
        ArrayList<DonsObject> objects = infoProvider.getSampleObjects();

        ArrayList<String> names = new ArrayList<>();
        for(DonsObject thisObject: objects) {
            names.add(thisObject.getName());
            //System.out.println(thisObject.getName());
        }

        return names;
    }
}
