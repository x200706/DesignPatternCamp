package factory;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public abstract class OutsidePackage {
  protected int abrasionResistance; // 耐用度

  public void show() {
    System.out.println(this.getClass().getSimpleName() + "包裝耐用度：" + abrasionResistance);
  }
}
// https://skyyen999.gitbooks.io/-study-design-pattern-in-java/content/abstractFactory2.html 這篇測試類上面生產武器邏輯跟訓練戰士邏輯無關，訓練戰士配發裝備是在戰士訓練營就用戰士裝備工廠製造+配發的