package org.Level2.Model;

public class AddressFactory extends AbstractFactory{

    @Override
    public Item getItem() {
        return new Address();
    }

}
