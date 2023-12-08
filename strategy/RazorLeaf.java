package strategy;

public class RazorLeaf implements FlightStrategy {
  @Override
  public void execute() {
    System.out.println("使出飛葉快刀");
  }
}