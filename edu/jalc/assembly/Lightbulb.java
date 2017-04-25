package edu.jalc.assembly;

import edu.jalc.electricity.Electricity;
import edu.jalc.glass.BulbType;
import edu.jalc.glass.BulbMaterial;
import edu.jalc.filament.Filament;
import edu.jalc.gas.Gas;
import edu.jalc.contact.ContactHousing;
import edu.jalc.actions.*;

public class Lightbulb implements Screwable, Switchable{

  private Electricity electricity;
  private BulbType bulbType;
  private BulbMaterial bulbMaterial;
  private Filament filament;
  private Gas gas;
  private ContactHousing contactHousing;
  private boolean switchIsOn;


  public Lightbulb(Electricity electricity,BulbType bulbType, BulbMaterial bulbMaterial, Filament filament, Gas gas, ContactHousing contactHousing){
    this.electricity = electricity;
    this.bulbType = bulbType;
    this.bulbMaterial = bulbMaterial;
    this.filament = filament;
    this.gas = gas;
    this.contactHousing = contactHousing;
    this.switchIsOn = switchIsOn;
  }

  public void screwIn(){
    System.out.println("You screwed the lightbulb in");
  }

  public void screwOut(){
    if (switchIsOn) {
      System.out.println("You burned your hand!");
    }
    else{
    System.out.println("You took out the lightbulb");
    }
  }

  public void screwOutHalfway(){
    if (switchIsOn) {
      System.out.println("You burned your hand!");
    }
    else{
    System.out.println("You unscrewed the lightbulb but left it in place");
    }
  }
  public boolean switchOn(){
    System.out.println("You turned the switch on");
    return switchIsOn;
  }
  public boolean switchOff(){
    System.out.println("You turned the switch off");
    return !switchIsOn;
  }

}
