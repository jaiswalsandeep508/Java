package Super;

class C {
  public C() {
    System.out.println("Default constructor C");
  }

  public C(int n) {
    System.out.println("Parametrized constructor C");
  }
}

class D extends C {
  public D() {
    super();
    System.out.println("Default constructor D");
  }

  public D(int i) {
    this();
    System.out.println("Parameterized constructor D");
  }
}

public class This {
  public static void main(String[] args) {
    D obj = new D(23);
  }
}
