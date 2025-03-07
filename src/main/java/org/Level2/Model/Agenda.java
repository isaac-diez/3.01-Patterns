package org.Level2.Model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Address> agendaAddress;
    private List<PhoneNumber> agendaPhoneNumber;

    public Agenda() {
        this.agendaAddress = new ArrayList<>();
        this.agendaPhoneNumber = new ArrayList<>();
    }

    public void addAddress(Address newAddress){
        this.agendaAddress.add(newAddress);
    }

    public void addPhone(PhoneNumber newPhoneNumber){
        this.agendaPhoneNumber.add(newPhoneNumber);
    }

    public List<Address> getAgendaAddress() {
        return agendaAddress;
    }

    public List<PhoneNumber> getAgendaPhoneNumber() {
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
