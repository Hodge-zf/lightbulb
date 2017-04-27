package edu.jalc.actions;
import edu.jalc.action.switchmomento.SwitchStatus;

public interface Switchable{

  public SwitchStatus switchOn();
  public SwitchStatus switchOff();
}
