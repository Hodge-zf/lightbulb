package edu.jalc.assembly;

import edu.jalc.assembly.Lightbulb;
import edu.jalc.glass.BulbMaterial;
import edu.jalc.glass.BulbType;
import edu.jalc.filament;

public class LightbulbApp{
  public static void main(String[] args) throws Exception{

    BulbType bulbType = new BulbType(4,"teardrop");
    BulbMaterial bulbMaterial = new BulbMaterial("glass",0.001);
    Filament filament = new Filament(2,"tungsten");
    Gas gas = new Gas(75,"Argon")
    ContactHousing contactHousing = new ContactHousing;
    Lightbulb lightBulb = new Lightbulb(120,bulbType,bulbMaterial,filament,contactHousing);

    System.out.println("Bulb Wattage: "+lightBulb.getWattage()+'W');
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
