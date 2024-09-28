package CollectionsTopic;

import java.util.Collection;

public class ArrayList {
  public static void main(String[] args) {
    Collection<Integer> nums = new java.util.ArrayList<Integer>();
    nums.add(5);
    nums.add(6);
    nums.add(7);
    nums.add(8);
    nums.add(9);
    nums.add(10);

    for (int i : nums) {
      System.out.println(i * 2);
    }
  }
}
