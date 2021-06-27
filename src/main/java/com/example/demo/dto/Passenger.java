package com.example.demo.dto;

public class Passenger {
    private Integer PassengerId;
    private String FirstName;
    private String LastName;
    private String email;
    private String cellNumber;
    public Passenger(Integer PID, String firstName, String lastName, String email, String cellNumber) {
        this.PassengerId = PID;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.email = email;
        this.cellNumber = cellNumber;
    }

    public Integer getPassengerId() {
        return PassengerId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCellNumber() {
        return cellNumber;
    }
}
