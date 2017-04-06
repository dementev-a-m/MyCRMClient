package com.example.mycrm.model;

import java.util.List;

/**
 * Created by Антон Дементьев on 02.04.2017.
 */

public class User {
    private int id;
    private String login;
    private String password;
    private int organizationId;
    private int personId;
    private List<Task> tasks;
    public User(){}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}