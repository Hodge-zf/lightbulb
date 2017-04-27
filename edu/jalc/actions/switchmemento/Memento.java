public class Memento{

  private SwitchStatus switchStatus;

  public Memento(SwitchStatus switchStatus){}

  public SwitchStatus getStatus(){
    return this.switchStatus;
  }
}
