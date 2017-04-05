package com.example.mycrm.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Антон Дементьев on 05.04.2017.
 */

public class Organizations {
    private static List<Organization> organizations = new ArrayList<>();

    public static synchronized List<Organization> getOrganizations() {
        return organizations;
    }
}
