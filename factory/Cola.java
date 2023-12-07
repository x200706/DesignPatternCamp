package factory;

public class Cola implements Beverage {
  @Override
  public String getKind() {
    System.out.println("可樂");
    return this.getClass().getSimpleName();
  }
}
