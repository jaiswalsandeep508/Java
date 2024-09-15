package Constructor;

class Human {
  int age;
  String name;

  // Default Constructor
  public Human() {
  }

  // Parametrized Constructor
  public Human(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}

public class Constructor_method {
  public static void main(String[] args) {

    Human obj = new Human(24, "Sandeep"); // Parametrized Constructor
    Human obj1 = new Human(); // Default Constructor
    System.out.println(obj.name + " : " + obj.age);
    System.out.println(obj1.name + " : " + obj1.age);
  }
}
