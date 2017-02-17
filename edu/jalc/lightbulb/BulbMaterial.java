public class BulbMaterial{

  private final String material;
  MaterialThickness materialThickness;

  public BulbMaterial(String material, MaterialThickness materialThickness){
    this.material = material;
    this.materialThickness = materialThickness;
  }
  public String getMaterial(){
    return material;
  }
  public MaterialThickness getThickness(){
    return materialThickness;
  }
}
