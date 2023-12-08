package strategy;

public class WaterGun implements FlightStrategy {
  @Override
  public void execute() {
    System.out.println("使出水槍");
  }
}