//package lightbulb.edu.jalc.lightbulb;

public class LightbulbApp{
  public static void main(String[] args) throws Exception{
    BulbType bulbType = new BulbType(4,"teardrop");

    Lightbulb lightBulb = new Lightbulb(120,bulbType);
    System.out.println("Bulb Wattage: "+lightBulb.getWattage()+'W');
    System.out.println("Bulb length: "+bulbType.getLength()+" inches");
    System.out.println("Bulb shape: "+bulbType.getShape());
  }
}
