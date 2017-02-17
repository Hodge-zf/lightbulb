//package lightbulb.edu.jalc.lightbulb;

public class Lightbulb{

  private int wattage;
  BulbType bulbType;
  BulbMaterial bulbMaterial;
  Filament filament;
  public Lightbulb(int wattage,BulbType bulbType, BulbMaterial bulbMaterial, Filament filament){
    this.wattage = wattage;
    this.bulbType = bulbType;
    this.bulbMaterial = bulbMaterial;
    this.filament = filament;
  }
  int getWattage(){
    return wattage;

  }
}
