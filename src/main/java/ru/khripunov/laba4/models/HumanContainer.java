package ru.khripunov.laba4.models;

import java.util.ArrayList;

public class HumanContainer {
    private ArrayList<Human> people;

    public HumanContainer() {
        this.people = new ArrayList<>();
    }
    public HumanContainer(ArrayList<Human> people) {
        this.people = people;
    }

    public ArrayList<Human> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Human> people) {
        this.people = people;
    }
}
