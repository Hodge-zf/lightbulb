package edu.jalc.builder;

import edu.jalc.builder.LightbulbBuilder;
import edu.jalc.builder.interfaces.LightbulbBuilderInterface;
import edu.jalc.assembly.Lightbulb;
import edu.jalc.electricity.Electricity;
import edu.jalc.contact.ContactHousing;
import edu.jalc.contact.ContactIn;
import edu.jalc.contact.ContactOut;
import edu.jalc.filament.Filament;
import edu.jalc.gas.Gas;
import edu.jalc.glass.BulbMaterial;
import edu.jalc.glass.BulbType;


public class HalogenBulbBuilder extends LightbulbBuilder{



  private int wattage;
  private int coilingLevel;
  private String filamentElement;
  private double gasVolume;
  private String gasElement;
  private String shape;
  private double length;
  private String material;
  private double thickness;

  public LightbulbBuilderInterface setAmountWattage(){
    this.wattage = 120;
    return this;
  }

  public LightbulbBuilderInterface chooseFilamentCoilingLevel(){
    this.coilingLevel = 2;
    return this;
  }

  public LightbulbBuilderInterface inputFilamentElement(){
    this.filamentElement = "Tungsten";
    return this;
  }
  public LightbulbBuilderInterface setGasVolume(){
    this.gasVolume = 75;
    return this;
  }

  public LightbulbBuilderInterface selectGasElement(){
    this.gasElement = "Iodine";
    return this;
  }

  public LightbulbBuilderInterface chooseBulbShape(){
    this.shape = "Bulbous";
    return this;
  }

  public LightbulbBuilderInterface setBulbLength(){
    this.length = 4;
    return this;
  }

  public LightbulbBuilderInterface selectBulbMaterial(){
    this.material = "Quartz";
    return this;
  }

  public LightbulbBuilderInterface setBulbThickness(){
    this.thickness = 0.001;
    return this;
  }

  public Lightbulb build(){
    Electricity electricity = new Electricity(wattage);
    BulbType bulbType = new BulbType(length,shape);
    BulbMaterial bulbMaterial = new BulbMaterial(material,thickness);
    Filament filament = new Filament(coilingLevel,filamentElement);
    Gas gas = new Gas(gasVolume,gasElement);
    ContactIn contactIn = new ContactIn();
    ContactOut contactOut = new ContactOut();
    ContactHousing contactHousing = new ContactHousing(contactIn, contactOut);
    System.out.println("Wattage of electricity: "+electricity.getWattage()+'W');
    System.out.println("Bulb length: "+bulbType.getLength()+" inches");
    System.out.println("Bulb shape: "+bulbType.getShape());
    System.out.println("Bulb material: "+bulbMaterial.getMaterial());
    System.out.println("Bulb thickness: "+bulbMaterial.getThickness());
    System.out.println("Filament coiled once or twice?: "+filament.getCoilingLevel()+" times");
    System.out.println("Filament composed of: "+filament.getFilamentElement());
    System.out.println("The volume of the gas is: "+gas.getGasVolume()+"mL");
    System.out.println("The gaseous element is: "+gas.getGasElement());
    return new Lightbulb(electricity,bulbType,bulbMaterial,filament,gas,contactHousing,1);
  }

}
