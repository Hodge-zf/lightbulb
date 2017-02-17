public class Filament{

  private final int coilingLevel;
  private final String element;

  public Filament(int coilingLevel, String element){
    this.coilingLevel = coilingLevel;
    this.element = element;
  }
  public int getCoilingLevel(){
    return coilingLevel;
  }
  public String getElement(){
    return element;
  }
}
