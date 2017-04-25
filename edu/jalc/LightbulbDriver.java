package edu.jalc;

import edu.jalc.actions.*;
import edu.jalc.assembly.*;
import edu.jalc.builder.*;
import edu.jalc.contact.*;
import edu.jalc.electricity.*;
import edu.jalc.filament.*;
import edu.jalc.gas.*;
import edu.jalc.glass.*;

public class LightbulbDriver{
  public static void main(String[] args){

    Lightbulb halogenBulb = new HalogenBulbBuilder()
      .setAmountWattage()
      .chooseFilamentCoilingLevel()
      .inputFilamentElement()
      .setGasVolume()
      .selectGasElement()
      .chooseBulbShape()
      .setBulbLength()
      .selectBulbMaterial()
      .setBulbThickness()
      .build();
    }
  }
