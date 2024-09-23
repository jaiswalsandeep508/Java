package Collections;

import java.util.Set;

public class HashSet {
  public static void main(String[] args) {
    Set<Integer> nums = new java.util.HashSet<Integer>();
    nums.add(6);
    nums.add(7); // Set accept only unique value
    nums.add(7);
    nums.add(8);
    nums.add(9);
    nums.add(10);

    for (int i : nums) {
      System.out.println(i);
    }
  }
}
