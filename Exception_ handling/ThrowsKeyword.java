
class A {
  public void show() throws ClassNotFoundException {
    Class.forName("E"); // undefind class E
  }
}

public class ThrowsKeyword {
  public static void main(String[] args) {

    A obj = new A();
    try {
      obj.show();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
