package This_keyword;

class Human {
  int age;
  String name;

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

public class This_keyword {
  public static void main(String[] args) {
    Human obj = new Human();
    obj.setAge(25);
    obj.setName("Sandeep");
    System.out.println(obj.getAge());
  }
}
