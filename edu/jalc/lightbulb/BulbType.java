//package lightbulb.edu.jalc.lightbulb;

public class BulbType{

  private final double length;
  private final String shape;


  public BulbType(double length, String shape){
    this.length = length;
    this.shape = shape;
  }

  public double getLength(){
    return length;
  }
  public String getShape(){
    return shape;
  }
}
