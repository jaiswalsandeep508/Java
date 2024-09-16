package Static;

class Mobile {
  String brand;
  int price;
  static String name;

  public void print() {
    System.out.println(brand + " : " + price + " : " + name);
  }

}

class Static_variables {
  public static void main(String[] args) {
    Mobile obj1 = new Mobile();
    obj1.brand = "Apple";
    obj1.price = 1500;

    Mobile obj2 = new Mobile();
    obj2.brand = "Samsung";
    obj2.price = 1100;

    Mobile.name = "Smart phone";

    obj1.print();
    obj2.print();

  }

}