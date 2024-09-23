package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
  public static void main(String[] args) {
    Map<String, Integer> students = new HashMap<>();

    students.put("Sandeep", 89);
    students.put("Seema", 86);
    students.put("Akash", 78);
    students.put("Aman", 56);
    students.put("Ankush", 43);

    for (String key : students.keySet()) {
      System.out.println(key + " : " + students.get(key));
    }

  };

}
