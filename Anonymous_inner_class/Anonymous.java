package Anonymous_inner_class;

abstract class A {
  public abstract void show();
}

public class Anonymous {
  public static void main(String[] args) {
    A obj = new A() {
      public void show() {
        System.out.println("In a anonymous inner class");
      }
    };

    obj.show();

  }
}
