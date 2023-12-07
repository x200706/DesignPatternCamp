package factory;

public class ColaFactory implements BeverageFactory {

  @Override
  public Beverage createBeverage() {
    System.out.println("可樂");
    return new Cola();
  }

}