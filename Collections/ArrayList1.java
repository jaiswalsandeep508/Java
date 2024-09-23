package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
  public static void main(String[] args) {

    List<Integer> nums = new ArrayList<Integer>();
    nums.add(5);
    nums.add(6);
    nums.add(7);
    nums.add(8); // index = 3
    nums.add(9);
    nums.add(10);

    System.out.println("Value at Index: " + nums.indexOf(8) + " -> " + nums.get(3));
  }
}
