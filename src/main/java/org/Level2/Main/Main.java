package org.Level2.Main;

import org.Level2.Model.AbstractFactory;
import org.Level2.Model.FactoryProducer;
import org.Level2.Model.Item;

public class Main {

    public static void main(String[] args) {

//        try {
            AbstractFactory factory = FactoryProducer.getFactory("address");
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//
//        }

        Item item1 = factory.
    }
}


