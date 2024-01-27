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

}
