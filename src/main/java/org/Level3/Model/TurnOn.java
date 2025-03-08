package org.Level3.Model;

public class TurnOn implements Command{

    private Vehicle vehicle;

    public TurnOn(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    @Override
    public void execute() {
        vehicle.turnOn();
    }
}
