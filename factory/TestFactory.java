package factory;

public class TestFactory implements BeverageFactory {
  @Override
  public Beverage createBeverage() {
    System.out.println("勉為其難出貨罷工前做的橘子汁");
    return new OrangeJuice();
  }

  public void strike() {
    System.out.println("發起罷工工廠是不做飲料的");
  }

}