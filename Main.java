import singleton.HelloUtil;
import factory.*;
import strategy.*;

class Main {
  public static void main(String[] args) {
    HelloUtil helloUtil = HelloUtil.getInstance();
    helloUtil.helloMethod();

    BeverageFactory bevergeFactory = new ColaFactory();
    Beverage cola = bevergeFactory.createBeverage();
    System.out.println(cola.getKind());

    bevergeFactory = new OrangeJuiceFactory();
    Beverage orangeJuice = bevergeFactory.createBeverage();
    System.out.println(orangeJuice.getKind());

    // 抽象包裝工廠測試
    EquipFactory equipFactory = new ColaEquipFactory();
    OutsidePackage colaPackage = equipFactory.productOutsidePackage();

    equipFactory = new OrangeJuiceEquipFactory();
    OutsidePackage orangeJuicePackage = equipFactory.productOutsidePackage();

    colaPackage.show();
    orangeJuicePackage.show();
    // https://skyyen999.gitbooks.io/-study-design-pattern-in-java/content/abstractFactory1.html
    // 小結論：包裝跟貼紙本來沒關係，但因為飲料 產生了他們都是飲料配件的抽象關係

    // 寶可夢遊戲
    Pokemon pokemon = new Pokemon();
    System.out.println("野生的小拳石出現了");
    pokemon.attack();
    System.out.println();

    System.out.println("野生的小火龍出現了");
    pokemon.choiceStrategy(new WaterGun());
    pokemon.attack();
    System.out.println();

    System.out.println("野生的妙蛙種子出現了");
    pokemon.choiceStrategy(new Flamethrower());
    pokemon.attack();
    System.out.println();

    System.out.println("野生的傑尼龜出現了");
    pokemon.choiceStrategy(new RazorLeaf());
    pokemon.attack();
    System.out.println();

    // 一個關於介面的迷思澄清
    TestFactory testFactory = new TestFactory();
    testFactory.strike();
  }
}