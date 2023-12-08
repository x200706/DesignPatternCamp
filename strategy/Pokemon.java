package strategy;

public class Pokemon { // 仔細想想這應該是夢幻或百變怪才能有三種屬性的攻擊吧=_=
  FlightStrategy flightStrategy;

  public void attack() {
    // 預設為高速星星
    if (flightStrategy == null) {
      flightStrategy = new Swift();
    }
    flightStrategy.execute();
  }

  // 使用屬性相剋技能
  public void choiceStrategy(FlightStrategy strategy) {
    this.flightStrategy = strategy;
  }
}