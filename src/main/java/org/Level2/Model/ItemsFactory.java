package org.Level2.Model;

public class ItemsFactory implements AbstractFactory{

    private String country;

    public ItemsFactory(String country) {
        this.country = country;
    }

    @Override
    public Address createAddress(String address, String city, String POCode) {
        return new GenericAddress(address,city,POCode,this.country);
    }

    @Override
    public PhoneNumber createPhoneNumber(String prefix, String phoneNumber) {
        return new GenericPhoneNumber(prefix,phoneNumber);
    }
}
