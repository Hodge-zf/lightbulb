package edu.jalc.builder;

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


abstract public class LightbulbBuilder implements LightbulbBuilderInterface{

  int wattage;
  int coilingLevel;
  String filamentElement;
  double gasVolume;
  String gasElement;
  String shape;
  double length;
  String material;
  double thickness;
  Lightbulb lightbulb;

  public LightbulbBuilderInterface setAmountWattage(int wattage){
    this.wattage = wattage;
    return this;
  }
  public LightbulbBuilderInterface chooseFilamentCoilingLevel(int coilingLevel){
    this.coilingLevel = coilingLevel;
    return this;
  }
  public LightbulbBuilderInterface inputFilamentElement(String filamentElement){
    this.filamentElement = filamentElement;
    return this;
  }
  public LightbulbBuilderInterface setGasVolume(double gasVolume){
    this.gasVolume = gasVolume;
    return this;
  }
  public LightbulbBuilderInterface selectGasElement(String gasElement){
    this.gasElement = gasElement;
    return this;
  }
  public LightbulbBuilderInterface chooseBulbShape(String shape){
    this.shape = shape;
    return this;
  }
  public LightbulbBuilderInterface setBulbLength(double length){
    this.length = length;
    return this;
  }
  public LightbulbBuilderInterface selectBulbMaterial(String material){
    this.material = material;
    return this;
  }
  public LightbulbBuilderInterface setBulbThickness(double thickness){
    this.thickness = thickness;
    return this;
  }
  public Lightbulb build(){
    return this.lightbulb;
}
}
