package edu.jalc.assembly;

import edu.jalc.glass.BulbType;
import edu.jalc.glass.BulbMaterial;
import edu.jalc.filament.Filament;
import edu.jalc.gas.Gas;
import edu.jalc.contact.ContactHousing;

public class Lightbulb{

  private int wattage;
  BulbType bulbType;
  BulbMaterial bulbMaterial;
  Filament filament;
  Gas gas;
  ContactHousing contactHousing;
  public Lightbulb(int wattage,BulbType bulbType, BulbMaterial bulbMaterial, Filament filament, Gas gas, ContactHousing contactHousing){
    this.wattage = wattage;
    this.bulbType = bulbType;
    this.bulbMaterial = bulbMaterial;
    this.filament = filament;
    this.gas = gas;
    this.contactHousing = contactHousing;
  }
  int getWattage(){
    return wattage;
  }
}
