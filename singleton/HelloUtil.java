package singleton;

import java.util.*;

public class HelloUtil {
  private static HelloUtil instance;

  private HelloUtil() {
  }

  public static synchronized HelloUtil getInstance() {
    if (instance == null) {
      synchronized (HelloUtil.class) {
        if (instance == null) {
          instance = new HelloUtil();
        }
      }
    }
    return instance;
  }

  public void helloMethod() {
    System.out.println("hello!");
  }
  // 參考文章：https://www.runoob.com/design-pattern/singleton-pattern.html
}