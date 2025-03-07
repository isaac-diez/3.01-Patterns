package org.Level2.Model;

import java.util.Objects;

public class GenericPhoneNumber implements PhoneNumber {

    private String countryCode, phoneNumber;

    public GenericPhoneNumber(String countryCode, String phoneNumber) {
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getFullPhoneNumber() {
        return this.countryCode + " " + this.phoneNumber;
    }


    @Override
    public String toString() {
        return getFullPhoneNumber();
    }
}
