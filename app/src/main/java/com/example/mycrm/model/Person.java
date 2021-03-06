package com.example.mycrm.model;

import java.util.Date;
import java.util.List;

public class Person {

    private int id;

    private String lastName;

    private String  firstName;

    private String middelName;

    private Date dataBithday;

    private String email;

    private String phone;

    private String sex;

    private String status;
    private List<Transaction> transaction;
    public Person() {
    }
    public Person(String lastName, String firstName, String middelName) {
        this.firstName=firstName;;
        this.lastName=lastName;
        this.middelName=middelName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddelName() {
        return middelName;
    }

    public void setMiddelName(String middelName) {
        this.middelName = middelName;
    }

    public Date getDataBithday() {
        return dataBithday;
    }

    public void setDataBithday(Date dataBithday) {
        this.dataBithday = dataBithday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }
}
