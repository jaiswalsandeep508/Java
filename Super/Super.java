package Super;

class A {
  public A() {
    super(); // By default every constructor has Super();
    System.out.println("In Default constructor A");
  }

  public A(int n) {
    System.out.println("In Parametrized constructor A");
  }
}

class B extends A {
  public B() {
    super(20); // By default every constructor has Super();
    System.out.println("In Default constructor B ");
  }
}

public class Super {
  public static void main(String[] args) {
    B obj = new B();
  }
}
