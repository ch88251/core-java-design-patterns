package com.cfhayes.patterns.abstractfactory;

public class LuxuryCar implements Car {
  private String make;
  private String model;
  private String features;

  public LuxuryCar(String make, String model) {
    this.make = make;
    this.model = model;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public String getFeatures() {
    return "Leather seats, auto drive";
  }
}
