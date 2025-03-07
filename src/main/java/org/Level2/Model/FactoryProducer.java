package org.Level2.Model;

public class FactoryProducer {

    public static AbstractFactory getFactory(String country) {
           return new ItemsFactory(country);
    }
}