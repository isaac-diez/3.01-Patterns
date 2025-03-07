package org.Level2.Model;

public class GenericAddress implements Address {

    private String address, city, country, POCode;

    public GenericAddress(String address, String city, String country, String POCode) {
        this.address = address;
        this.city = city;
        this.country = country;
        this.POCode = POCode;
    }

    @Override
    public String getFullAddress() {
        return this.address + ", " + this.POCode + " - " + this.city+", "+this.country ;
    }
}
