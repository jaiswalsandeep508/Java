package Arrys;

class Student {
  int age;
  String name;
  int marks;
}

public class Objects {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Sandeep";
    s1.age = 25;
    s1.marks = 95;

    Student s2 = new Student();
    s2.name = "Seema";
    s2.age = 22;
    s2.marks = 93;

    Student s3 = new Student();
    s3.name = "Anvi";
    s3.age = 0;
    s3.marks = 0;

    Student students[] = new Student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    for (Student stu : students) {
      System.out.println(stu.name + " : " + stu.marks);
    }
  }
}
