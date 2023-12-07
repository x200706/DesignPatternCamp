import singleton.HelloUtil;

class Main {
  public static void main(String[] args) {
    HelloUtil helloUtil = HelloUtil.getInstance();
    helloUtil.helloMethod();
  }
}