package edu.jalc.glass;

public class BulbMaterial{

  private final String material;
  private double thickness;

  public BulbMaterial(String material, double thickness){
    this.material = material;
    this.thickness = thickness;
  }
  public String getMaterial(){
    return material;
  }
  public double getThickness(){
    return thickness;
  }
}
