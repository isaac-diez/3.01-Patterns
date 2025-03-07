package org.Level2.Main;

import org.Level2.Model.*;

public class Main {

    public static void main(String[] args) {

        AbstractFactory SpainFactory = FactoryProducer.getFactory("Spain");

        Address spainAddress = SpainFactory.createAddress("Avda. Diagonal 198", "Barcelona", "08010");
        PhoneNumber spainPhone = SpainFactory.createPhoneNumber("+34", "93548875");

        Agenda agenda = new Agenda();

        agenda.addAddress(spainAddress);
        agenda.addPhone(spainPhone);

        System.out.println(agenda);
    }
}


