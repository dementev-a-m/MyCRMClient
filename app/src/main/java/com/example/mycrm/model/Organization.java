package com.example.mycrm.model;

import java.util.List;

public class Organization {

    private long id;
    private String name;
    private String address;
    private int inn;
    private String phone;
    private String email;
    private long primaryPersonId;
    private List<Product> products;
    private List<User> users;
    public Organization (){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPrimaryPersonId() {
        return primaryPersonId;
    }

    public void setPrimaryPersonId(long primaryPersonId) {
        this.primaryPersonId = primaryPersonId;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}