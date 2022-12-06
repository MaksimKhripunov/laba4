package ru.khripunov.laba4.models;

import java.util.ArrayList;

public class DivisionContainer {
    private ArrayList<Division> divisions;

    public DivisionContainer() {
        this.divisions = new ArrayList<>();
    }

    public DivisionContainer(ArrayList<Division> divisions) {
        this.divisions = divisions;
    }

    public ArrayList<Division> getDivisions() {
        return divisions;
    }

    public void setDivisions(ArrayList<Division> divisions) {
        this.divisions = divisions;
    }
}
