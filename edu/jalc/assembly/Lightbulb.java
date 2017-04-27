package edu.jalc.assembly;

import edu.jalc.electricity.Electricity;
import edu.jalc.glass.BulbType;
import edu.jalc.glass.BulbMaterial;
import edu.jalc.filament.Filament;
import edu.jalc.gas.Gas;
import edu.jalc.contact.ContactHousing;
import edu.jalc.actions.*;

public class Lightbulb implements Screwable, Switchable, Brightenable, Dimmable{

  public Electricity electricity;
  private BulbType bulbType;
  private BulbMaterial bulbMaterial;
  private Filament filament;
  private Gas gas;
  private ContactHousing contactHousing;
  private SwitchStatus switchStatus;
  private int variedWattage;

  public Lightbulb(Electricity electricity,BulbType bulbType, BulbMaterial bulbMaterial, Filament filament, Gas gas, ContactHousing contactHousing,int switchStatus){
    this.electricity = electricity;
    this.bulbType = bulbType;
    this.bulbMaterial = bulbMaterial;
    this.filament = filament;
    this.gas = gas;
    this.contactHousing = contactHousing;
  }
/* FIXME (Will implement memento pattern to return switchStatus)*/
  public SwitchStatus switchOn(){
    System.out.println("You turned the switch on");
    return this.switchStatus = 0;
  }

  public SwitchStatus switchOff(SwitchStatus switchStatus){
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

/* FIXME end */

  public int brighten(int initial){
    System.out.println("You turn the dial up, increasing Wattage by 1");
    variedWattage = initial+1;
    return this.variedWattage;
  }
  public int dim(int initial){
    System.out.println("You turn the dial down, decreasing Wattage by 1");
    variedWattage = initial-1;
    return this.variedWattage;
  }

/* FIXME will need to be updated*/ 
  public int getSwitchStatus(){
    return switchStatus;
  }

  public void glow(){
    System.out.println("The bulb glows with an intensity of "+variedWattage+" Watts");
  }


}
