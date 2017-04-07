package edu.jalc.assembly;

import edu.jalc.assembly.Lightbulb;
import edu.jalc.electricity.Electricity;
import edu.jalc.contact.ContactHousing;
import edu.jalc.contact.ContactIn;
import edu.jalc.contact.ContactOut;
import edu.jalc.filament.Filament;
import edu.jalc.gas.Gas;
import edu.jalc.glass.BulbMaterial;
import edu.jalc.glass.BulbType;

public class LightbulbApp{
  public static void main(String[] args) throws Exception{


    Electricity electricity = new Electricity(120);
    BulbType bulbType = new BulbType(4,"teardrop");
    BulbMaterial bulbMaterial = new BulbMaterial("glass",0.001);
    Filament filament = new Filament(2,"tungsten");
    Gas gas = new Gas(75,"Argon");
    ContactIn contactIn = new ContactIn();
    ContactOut contactOut = new ContactOut();
    ContactHousing contactHousing = new ContactHousing(contactIn, contactOut);
    Lightbulb lightBulb = new Lightbulb(electricity,bulbType,bulbMaterial,filament,gas,contactHousing);

    System.out.println("Wattage of electricity: "+electricity.getWattage()+'W');
    System.out.println("Bulb length: "+bulbType.getLength()+" inches");
    System.out.println("Bulb shape: "+bulbType.getShape());
    System.out.println("Bulb material: "+bulbMaterial.getMaterial());
    System.out.println("Bulb thickness: "+bulbMaterial.getThickness());
    System.out.println("Filament coiled once or twice?: "+filament.getCoilingLevel()+" times");
    System.out.println("Filament composed of: "+filament.getFilamentElement());
    System.out.println("The volume of the gas is: "+gas.getGasVolume()+"mL");
    System.out.println("The gaseous element is: "+gas.getGasElement());
  }
}
