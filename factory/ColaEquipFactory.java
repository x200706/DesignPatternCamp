package factory;

public class ColaEquipFactory implements EquipFactory {

  @Override
  public OutsidePackage productOutsidePackage() {
    GlassBottle product = new GlassBottle();
    product.setAbrasionResistance(50);
    return product;
  }
}
