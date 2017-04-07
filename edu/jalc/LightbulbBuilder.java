package edu.jalc;

import edu.jalc.assembly.Lightbulb;
import edu.jalc.electricity.Electricity;
import edu.jalc.contact.ContactHousing;
import edu.jalc.contact.ContactIn;
import edu.jalc.contact.ContactOut;
import edu.jalc.filament.Filament;
import edu.jalc.gas.Gas;
import edu.jalc.glass.BulbMaterial;
import edu.jalc.glass.BulbType;

public class LightbulbBuilder implements LightbulbBuilderInterface{

private int wattage;
private int coilingLevel;
private String filamentElement;
private double gasVolume;
private String gasElement;
private String shape;
private double length;
private String material;
private double thickness;

public void setAmountWattage(int wattage){
  this.wattage = wattage;
}
public void chooseFilamentCoilingLevel(int coilingLevel){
  this.coilingLevel = coilingLevel;
}
public void inputFilamentElement(String filamentElement){
  this.filamentElement = filamentElement;
}
public void setGasVolume(double gasVolume){
  this.gasVolume = gasVolume;
}
public void selectGasElement(String gasElement){
  this.gasElement = gasElement;
}
public void chooseBulbShape(String shape){
  this.shape = shape;
}
public void setBulbLength(double length){
  this.length = length;
}
public void selectBulbMaterial(String material){
  this.material = material;
}
public void setBulbThickness(double thickness){
  this.thickness = thickness;
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
  return new Lightbulb(electricity,bulbType,bulbMaterial,filament,gas,contactHousing);
}
}
