//package lightbulb.edu.jalc.lightbulb;

public class LightbulbApp{
  public static void main(String[] args) throws Exception{
    
    BulbType bulbType = new BulbType(4,"teardrop");
    BulbMaterial bulbMaterial = new BulbMaterial("glass",new MaterialThickness(0.001));
    Lightbulb lightBulb = new Lightbulb(120,bulbType, bulbMaterial);

    System.out.println("Bulb Wattage: "+lightBulb.getWattage()+'W');
    System.out.println("Bulb length: "+bulbType.getLength()+" inches");
    System.out.println("Bulb shape: "+bulbType.getShape());
    System.out.println("Bulb material: "+bulbMaterial.getMaterial());
    System.out.println("Bulb thickness: "+bulbMaterial.getThickness());
  }
}
