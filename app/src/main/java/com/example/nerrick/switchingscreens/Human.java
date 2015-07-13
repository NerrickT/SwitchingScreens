package com.example.nerrick.switchingscreens;

import java.io.Serializable;

/**
 * Created by nerrick on 7/12/15.
 *
 * This will allow a user to pass objects between screens
 */


public class Human implements Serializable {

    private double height, weight;
    private String name = "";

    public Human(double height, double weight, String name) {
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
