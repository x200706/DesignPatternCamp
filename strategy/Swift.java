package strategy;

public class Swift implements FlightStrategy {
  @Override
  public void execute() {
    System.out.println("使出高速星星");
  }
}