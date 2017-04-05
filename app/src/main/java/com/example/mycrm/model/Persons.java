package com.example.mycrm.model;


import java.util.ArrayList;
import java.util.List;

public class Persons {
    private static List<Person> persons=new ArrayList<>();

    public static synchronized List<Person> getPersonList(){
        return persons;
    }

}
