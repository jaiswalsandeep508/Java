package CollectionsTopic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
  int age;
  String name;

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student [age=" + age + ", name=" + name + "]";
  }

}

public class SortStudents {
  public static void main(String[] args) {

    Comparator<Student> com = new Comparator<Student>() {
      public int compare(Student i, Student j) {
        if (i.age > j.age)
          return 1;
        else
          return -1;
      }
    };

    List<Student> stud = new ArrayList<>();
    stud.add(new Student(24, "Sandeep"));
    stud.add(new Student(22, "Seema"));
    stud.add(new Student(23, "Shivam"));
    stud.add(new Student(23, "Ravi"));
    stud.add(new Student(26, "Rohan"));

    for (Student s : stud)
      System.out.println(s);

    System.out.println("Sorted Students List:----------");
    Collections.sort(stud, com);
    for (Student s : stud)
      System.out.println(s);

  }
}
