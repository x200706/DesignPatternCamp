import singleton.HelloUtil;
import factory.*;

class Main {
  public static void main(String[] args) {
    HelloUtil helloUtil = HelloUtil.getInstance();
    helloUtil.helloMethod();

    BeverageFactory bevergeFactory = new ColaFactory();
    Beverage cola = bevergeFactory.createBeverage();

    bevergeFactory = new OrangeJuiceFactory();
    Beverage orangeJuice = bevergeFactory.createBeverage();
    System.out.println(cola.getKind());
    System.out.println(orangeJuice.getKind());

    // 抽象包裝工廠測試 略
    // https://skyyen999.gitbooks.io/-study-design-pattern-in-java/content/abstractFactory1.html
    // 小結論：包裝跟貼紙本來沒關係，但因為飲料 產生了他們都是飲料配件的抽象關係
  }
}