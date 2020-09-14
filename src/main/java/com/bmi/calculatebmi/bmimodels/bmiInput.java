package com.bmi.calculatebmi.bmimodels;

public class bmiInput {

    public int weigth;
    public int feet;
    public int inches;

    public bmiInput() {
    }

    public bmiInput(int weigth, int feet, int inches) {
        this.weigth = weigth;
        this.feet = feet;
        this.inches = inches;
    }

    public int getWeigth() {
        return this.weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getFeet() {
        return this.feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return this.inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public bmiInput weigth(int weigth) {
        this.weigth = weigth;
        return this;
    }

    public bmiInput feet(int feet) {
        this.feet = feet;
        return this;
    }

    public bmiInput inches(int inches) {
        this.inches = inches;
        return this;
    }
}