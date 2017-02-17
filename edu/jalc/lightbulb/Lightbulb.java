//package lightbulb.edu.jalc.lightbulb;

public class Lightbulb{

  private int wattage;
  BulbType bulbType;
  BulbMaterial bulbMaterial;
  public Lightbulb(int wattage,BulbType bulbType, BulbMaterial bulbMaterial){
    this.wattage = wattage;
    this.bulbType = bulbType;
    this.bulbMaterial = bulbMaterial;
  }
  int getWattage(){
    return wattage;

  }
}
