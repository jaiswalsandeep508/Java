package Calculator;

class InnerCalculator {
  public int add(int n1, int n2) {
    int result = n1 + n2;
    return result;
  }

}

public class Calculator {
  public static void main(String[] args) {

    InnerCalculator calc = new InnerCalculator();
    int result = 0;
    System.out.println("-------Welcome to the Calculator World--------");
    System.out.println("You want to calculate?? Please click on Y/N");
    char ch = 'Y';

    if (ch == 'Y') {
      System.out.println("Please select any one of them:-------");
      System.out.println("Addition: 1");
      System.out.println("Subtract: 2");
      System.out.println("Multiply: 3");
      System.out.println("Divide:   4");
      int str = 1;

      System.out.println("Enter any two numbers: ");
      int num1 = 5, num2 = 6;

      switch (str) {
        case 1:
          result = calc.add(num1, num2);
          break;

        default:
          System.out.println("You have enter wrong choice!!!!!");
          break;
      }
    } else
      System.out.println("You have selected N");

    System.out.println("Your answer is: " + result);
  }

}
