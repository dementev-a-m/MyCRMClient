package com.example.mycrm.model;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private static List<Product> products = new ArrayList<>();
    public static synchronized List<Product> getProducts(){
        return products;
    }
}
