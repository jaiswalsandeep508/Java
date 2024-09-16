package Enumeration;

enum Laptop {
  Mackbook(1800), XPS(1200), Surface(1500), ThinkPad(800);

  private int price;

  private Laptop(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

}

public class Enumerations {
  public static void main(String[] args) {
    // Laptop lap = Laptop.Mackbook; //call single value

    for (Laptop lap : Laptop.values()) { // fetch all values as array
      System.out.println(lap + " : " + lap.getPrice());
    }

  }
}
