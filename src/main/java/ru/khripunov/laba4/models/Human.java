package ru.khripunov.laba4.models;

import java.util.ArrayList;

public class Human {
    private int ID;
    private String name;
    private String gender;
    private String birthDate;
    private Division division;
    private double salary;


    public Human(int id, String name, String gender,String birthDate, Division division, double salary) {
        this.ID = id;
        this.name = name;
        this.gender = gender;
        this.birthDate=birthDate;
        this.division = division;
        this.salary = salary;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
