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

  public LightbulbBuilder createContactStructure(){}
  public LightbulbBuilder installFilament(){}
  public LightbulbBuilder addGas(){}
  public LightbulbBuilder manufactureBulb(){}
}
