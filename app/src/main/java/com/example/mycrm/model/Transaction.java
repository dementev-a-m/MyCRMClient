package com.example.mycrm.model;

import java.util.Date;

public class Transaction {
    private int id;
    private int personId;
    private int organizationId;
    private double price;
    private String status;
    private Date date;
    public Transaction(){}
    public Transaction(int id, int personId){
        this.id=id;
        this.personId=personId;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
