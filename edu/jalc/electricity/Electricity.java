package edu.jalc.electricity;


public class Electricity{

  private int wattage;

  public Electricity(int wattage){
    this.wattage = wattage;
  }

  public int getWattage(){
    return wattage;
  }
  public int brighten(int wattage){
    this.wattage = wattage++;
    return wattage;
  }
  public int dim(int wattage){
    this.wattage = wattage--;
    return wattage;
  }
}
