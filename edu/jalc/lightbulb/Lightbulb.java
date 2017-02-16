//package lightbulb.edu.jalc.lightbulb;

public class Lightbulb{

  private int wattage;
  BulbType bulbType;

  public Lightbulb(int wattage,BulbType bulbType){
    this.wattage = wattage;
    this.bulbType = bulbType;
  }
  int getWattage(){
    return wattage;

  }
}
