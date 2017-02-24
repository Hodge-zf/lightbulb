package edu.jalc.gas;

public class Gas{

  private final double gasVolume;
  private final String gasElement;

  public Gas(double gasVolume, String gasElement){
    this.gasVolume = gasVolume;
    this.gasElement = gasElement;
  }
  public double getGasVolume(){
    return gasVolume;
  }
  public String getGasElement(){
    return gasElement;
  }
}
