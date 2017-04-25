package edu.jalc.builder.interfaces;

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
  LightbulbBuilderInterface setAmountWattage();
  LightbulbBuilderInterface chooseFilamentCoilingLevel();
  LightbulbBuilderInterface inputFilamentElement();
  LightbulbBuilderInterface setGasVolume();
  LightbulbBuilderInterface selectGasElement();
  LightbulbBuilderInterface chooseBulbShape();
  LightbulbBuilderInterface setBulbLength();
  LightbulbBuilderInterface selectBulbMaterial();
  LightbulbBuilderInterface setBulbThickness();

  Lightbulb build();
  //Things that the user cannot change will be hidden under here
}
