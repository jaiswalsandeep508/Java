package Lamda_expression;

//Functional interface: A interface in which only one method
@FunctionalInterface
interface A {
  int add(int i, int j); // public abstract int add();
}

public class Lamda_expression {
  public static void main(String[] args) {

    A obj = (i, j) -> i + j; // Lambda expression

    int result = obj.add(5, 6);
    System.out.println(result);
  }
}
