package org.Level2.Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Agenda {

    private Set<Address> agendaAddress;
    private Set<PhoneNumber> agendaPhoneNumber;

    public Agenda() {
        this.agendaAddress = new HashSet<>();
        this.agendaPhoneNumber = new HashSet<>();
    }

    public void addAddress(Address newAddress){
        this.agendaAddress.add(newAddress);
    }

    public void addPhone(PhoneNumber newPhoneNumber){
        this.agendaPhoneNumber.add(newPhoneNumber);
    }

    public Set<Address> getAgendaAddress() {
        return agendaAddress;
    }

    public Set<PhoneNumber> getAgendaPhoneNumber() {
        return agendaPhoneNumber;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "agendaAddress=" + agendaAddress +
                ", agendaPhoneNumber=" + agendaPhoneNumber +
                '}';
    }
}
