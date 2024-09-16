package Interface;

interface A {
  void show(); // public abstract void show();
}

class B implements A {

  public void show() {
    System.out.println("In a show method");
  }

}

public class Interfaces {
  public static void main(String[] args) {

    A obj = new B();
    obj.show();

  }
}
