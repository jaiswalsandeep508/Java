package CollectionsTopic;

import java.util.Set;

public class TreeSet {
  public static void main(String[] args) {
    Set<Integer> nums = new java.util.TreeSet<Integer>();
    nums.add(63);
    nums.add(45); // TreeSet return a sorted array with unique values
    nums.add(77);
    nums.add(38);
    nums.add(77);// remove this element in output due to dublicacy
    nums.add(17);

    for (int i : nums) {
      System.out.println(i);
    }
  }
}
