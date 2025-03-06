package org.Level2.Model;

public class PhoneNoFactory extends AbstractFactory{

    public Item getItem() {
        return new PhoneNumber();

    }

}
