package com.cfhayes.patterns.abstractfactory;

public class NonLuxuryCar implements Car {
  private String make;
  private String model;
  private String features;

  public NonLuxuryCar(String make, String model) {
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
    return "Cloth seats, manual drive";
  }
}
