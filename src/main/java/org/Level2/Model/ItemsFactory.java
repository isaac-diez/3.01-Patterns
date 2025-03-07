package org.Level2.Model;

public class ItemsFactory implements AbstractFactory{

    private String country;

    public ItemsFactory(String country) {
        this.country = country;
    }

    @Override
    public Address createAddress(String address, String City, String POCode) {
        return null;
    }

    @Override
    public PhoneNumber createPhoneNumber(String prefix, String phoneNumber) {
        return null;
    }
}
