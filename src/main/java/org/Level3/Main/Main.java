package org.Level3.Main;

import org.Level3.Model.Accelerate;
import org.Level3.Model.Driver;
import org.Level3.Model.TurnOn;
import org.Level3.Model.Vehicle;

public class Main {

    public static void main(String[] args) {

        Vehicle car = new Vehicle("car");
        Vehicle bike = new Vehicle("bike");
        Vehicle boat = new Vehicle("boat");
        Vehicle plane = new Vehicle("plane");

        Accelerate accelerate = new Accelerate(car);
        TurnOn turnOn = new TurnOn(plane);
        TurnOn turnIgnitionOn = new TurnOn(car);

        Driver pilot = new Driver();

        pilot.incomingCommand(turnIgnitionOn);
        pilot.incomingCommand(turnOn);

    }


}
