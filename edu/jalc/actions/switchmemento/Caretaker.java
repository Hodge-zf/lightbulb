import java.util.*;

public class Caretaker{

  private ArrayList<Memento> events;

  protected Caretaker(){
    this.events = new ArrayList<>();
  }

  protected void add(Memento memento){
    events.add(memento);
  }

  protected Memento get(int x){
    return events.get(x);
  }
}
