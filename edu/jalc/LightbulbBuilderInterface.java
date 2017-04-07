package edu.jalc;

import edu.jalc.assembly.Lightbulb;
import edu.jalc.contact.ContactHousing;
import edu.jalc.contact.ContactIn;
import edu.jalc.contact.ContactOut;
import edu.jalc.filament.Filament;
import edu.jalc.gas.Gas;
import edu.jalc.glass.BulbMaterial;
import edu.jalc.glass.BulbType;

public interface LightbulbBuilderInterface{

  //Things that the user is given a choice in
  void LightbulbBuilder setAmountWattage(int wattage);
  void LightbulbBuilder chooseFilamentCoilingLevel(int coilingLevel);
  void LightbulbBuilder inputFilamentElement(String filamentElement);
  void LightbulbBuilder setGasVolume(double gasVolume);
  void LightbulbBuilder selectGasElement(String gasElement);
  void LightbulbBuilder chooseBulbShape(String shape);
  void LightbulbBuilder setBulbLength(double length);
  void LightbulbBuilder selectBulbMaterial(String material);
  void LightbulbBuilder setBulbThickness(double thickness);

  Lightbulb build();
  //Things that the user cannot change will be hidden under here
}
