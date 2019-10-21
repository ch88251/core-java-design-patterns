package com.cfhayes.patterns.abstractfactory;

public class NonLuxurySUV implements SUV {
  private String make;
  private String model;
  private String features;

  public NonLuxurySUV(String make, String model) {
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
    return "Cloth seats, manual drive, GPS";
  }
}
