package com.cfhayes.patterns.abstractfactory;

public class NonLuxuryVehicleFactory extends VehicleFactory {

  public Car getCar() {
    return new NonLuxuryCar("Honda", "Civic");
  }

  public SUV getSUV() {
    return new NonLuxurySUV("Honda", "Pilot");
  }

}
