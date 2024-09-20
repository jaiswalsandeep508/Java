class SandeepException extends Exception {
  public SandeepException(String str) {
    super(str);
  }
}

public class My_exception {
  public static void main(String[] args) {
    int i = 20;
    int j = 0;

    try {
      j = 18 / i;
      if (j == 0) {
        throw new SandeepException("You have divide by Zero!!!!!");
      }
    } catch (SandeepException e) {
      System.out.println(e);
    }
  }
}
