package edu.jalc.assembly;

import edu.jalc.glass.BulbType;
import edu.jalc.glass.BulbMaterial;
import edu.jalc.filament.Filament;
import edu.jalc.gas.Gas;
import edu.jalc.contact.ContactHousing;

public class Lightbulb{

  private int wattage;
  private BulbType bulbType;
  private BulbMaterial bulbMaterial;
  private Filament filament;
  private Gas gas;
  private ContactHousing contactHousing;

  public Lightbulb(int wattage,BulbType bulbType, BulbMaterial bulbMaterial, Filament filament, Gas gas, ContactHousing contactHousing){
    this.wattage = wattage;
    this.bulbType = bulbType;
    this.bulbMaterial = bulbMaterial;
    this.filament = filament;
    this.gas = gas;
    this.contactHousing = contactHousing;
  }
  public int getWattage(){
    return wattage;
  }
}
