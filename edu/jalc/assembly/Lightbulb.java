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
  private int switchStatus;

  public Lightbulb(Electricity electricity,BulbType bulbType, BulbMaterial bulbMaterial, Filament filament, Gas gas, ContactHousing contactHousing,int switchStatus){
    this.electricity = electricity;
    this.bulbType = bulbType;
    this.bulbMaterial = bulbMaterial;
    this.filament = filament;
    this.gas = gas;
    this.contactHousing = contactHousing;
    this.switchStatus = switchStatus;
  }

  public int switchOn(int switchStatus){
    System.out.println("You turned the switch on");
    return this.switchStatus = 0;
  }

  public int switchOff(int switchStatus){
    System.out.println("You turned the switch off");
    return this.switchStatus = 1;
  }
  public void screwIn(){
    System.out.println("You screwed the lightbulb in");
  }

  public void screwOut(){
    switch (switchStatus) {
      case 0: System.out.println("You burned your hand trying to unscrew it!");
              break;
      case 1: System.out.println("You took out the lightbulb");
              break;
      default: break;
    }
  }

  public void screwOutHalfway(){
    switch (switchStatus) {
      case 0: System.out.println("You burned your hand trying to unscrew it!");
              break;
      case 1: System.out.println("You unscrewed the lightbulb but left it in place");
              break;
      default: break;
    }
  }

  public int getSwitchStatus(){
    return switchStatus;
  }


}
