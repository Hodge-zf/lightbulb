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

public interface LightbulbBuilderInterface{

  //Things that the user is given a choice in
  void setAmountWattage(int wattage);
  void chooseFilamentCoilingLevel(int coilingLevel);
  void inputFilamentElement(String filamentElement);
  void setGasVolume(double gasVolume);
  void selectGasElement(String gasElement);
  void chooseBulbShape(String shape);
  void setBulbLength(double length);
  void selectBulbMaterial(String material);
  void setBulbThickness(double thickness);

  Lightbulb build();
  //Things that the user cannot change will be hidden under here
}
