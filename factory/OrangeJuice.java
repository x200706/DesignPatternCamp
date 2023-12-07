package factory;

public class OrangeJuice implements Beverage {
  @Override
  public String getKind() {
    System.out.println("橘子汁");
    return this.getClass().getSimpleName();
  }
}
