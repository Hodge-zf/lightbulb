package edu.jalc.filament;

public class Filament{

  private final int coilingLevel;
  private final String filamentElement;

  public Filament(int coilingLevel, String filamentElement){
    this.coilingLevel = coilingLevel;
    this.filamentElement = filamentElement;
  }
  public int getCoilingLevel(){
    return coilingLevel;
  }
  public String getFilamentElement(){
    return filamentElement;
  }
}
