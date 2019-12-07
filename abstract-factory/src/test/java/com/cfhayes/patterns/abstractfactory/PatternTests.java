package com.cfhayes.patterns.abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatternTests {

  @Test
  public void createNonLuxuryCar() {
    VehicleFactory vehicleFactory = VehicleFactory.getVehicleFactory(VehicleFactory.NON_LUXURY_VEHICLE);
    Car car = vehicleFactory.getCar();
    assertEquals("Non-Luxury Car", car.getMake());
  }
}
