package org.Level2.Model;

public interface AbstractFactory {

    Address createAddress(String address, String City, String POCode);
    PhoneNumber createPhoneNumber(String prefix, String phoneNumber);

}
