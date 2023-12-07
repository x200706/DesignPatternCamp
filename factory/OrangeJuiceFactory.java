package factory;

public class OrangeJuiceFactory implements BeverageFactory {
  @Override
  public Beverage createBeverage() {
    System.out.println("橘子汁");
    return new OrangeJuice();
  }

}