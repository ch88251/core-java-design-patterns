package com.cfhayes.patterns.abstractfactory;

public class LuxuryVehicleFactory extends VehicleFactory {

  public Car getCar() {
    return new LuxuryCar("Lincoln", "Continental");
  }

  public SUV getSUV() {
    return new LuxurySUV("Lincoln", "Navigator");
  }

}
