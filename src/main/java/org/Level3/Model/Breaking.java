package org.Level3.Model;

public class Breaking implements Command {

    private Vehicle vehicle;

    public Breaking(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.breaking();
    }
}
