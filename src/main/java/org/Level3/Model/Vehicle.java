package org.Level3.Model;

public class Vehicle {

    private String type;

    public Vehicle(String type){
        this.type = type;
    }

    public void turnOn() {
        System.out.println(type + " is turned on.");
    }

    public void accelerate() {
        System.out.println(type + " is accelerating.");
    }

    public void breaking() {
        System.out.println(type + " is slowing down.");
    }
}
