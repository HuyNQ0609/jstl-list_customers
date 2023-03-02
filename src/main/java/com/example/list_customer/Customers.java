package com.example.list_customer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customers {
    private String name;
    private Date dateOfBirth;
    private String address;
    private static final DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

    public Customers() {
    }

    public Customers(String name, String dateOfBirth, String address) {
        this.name = name;
        this.address = address;
        try {
            this.dateOfBirth = df.parse(dateOfBirth);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
