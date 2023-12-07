package factory;

public class OrangeJuiceEquipFactory implements EquipFactory {
  @Override
  public OutsidePackage productOutsidePackage() {
    RetortPouch product = new RetortPouch();
    product.setAbrasionResistance(20);
    return product;
  }
}
