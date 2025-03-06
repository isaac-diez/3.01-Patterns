package org.Level2.Model;

public class FactoryProducer {

    public static AbstractFactory getFactory(String typeOfItem) {
        if (typeOfItem.equalsIgnoreCase("address")) {
            return new AddressFactory();
        }

        if (typeOfItem.equalsIgnoreCase("phone")) {
            return new PhoneNoFactory();
        }

        throw new IllegalArgumentException("Unknown factory type: " + typeOfItem);

    }
}