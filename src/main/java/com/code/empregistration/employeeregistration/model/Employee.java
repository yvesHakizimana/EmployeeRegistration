package com.code.empregistration.employeeregistration.model;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUid = 1L;


    private String firstName;
    private String lastName;
    private String username;
    private String password;


    private String contact;
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }
    private String address;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
