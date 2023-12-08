package strategy;

public class Flamethrower implements FlightStrategy {
  @Override
  public void execute() {
    System.out.println("使出噴射火焰");
  }
}