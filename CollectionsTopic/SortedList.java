package CollectionsTopic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();
    nums.add(45);
    nums.add(11);
    nums.add(35);
    nums.add(22);
    nums.add(88);
    nums.add(69);

    Collections.sort(nums);
    System.out.println(nums);
  }
}
