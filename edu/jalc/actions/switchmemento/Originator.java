package edu.jalc.actions.switchmemento;

public class Originator{

    private SwitchStatus switchStatus;
    private Caretaker caretaker;

    public Originator(){
      this.switchStatus = switchStatus;
      this.caretaker = new Caretaker();
    }
    public void setStatus(SwitchStatus switchStatus){
      this.switchStatus = switchStatus;
    }
    public SwitchStatus getStatus(){
      return this.switchStatus;
    }
    public void save(){
      Memento memento = new Memento(switchStatus);
      caretaker.add(memento);
    }
    public Memento getStatusFromCaretaker(int x){
      return caretaker.get(x);
    }

  }
