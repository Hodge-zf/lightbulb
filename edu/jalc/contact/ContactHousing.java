package edu.jalc.contact;
import edu.jalc.actions.Screwable;
import edu.jalc.contact.ContactIn;
import edu.jalc.contact.ContactOut;

public class ContactHousing implements Screwable{

  private ContactIn contactIn;
  private ContactOut contactOut;

  public ContactHousing(ContactIn contactIn, ContactOut contactOut){
    this.contactIn = contactIn;
    this.contactOut = contactOut;
  }

  public void screwIn(){
    System.out.println("You screwed the lightbulb in.");
  }
  public void screwOut(){
    System.out.println("You unscrewed the lightbulb.");
  }
  public void screwOutHalfway(){
    System.out.println("You unscrewed the lightbulb, but left it in place.");
  }
}
