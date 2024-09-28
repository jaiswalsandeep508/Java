package CollectionsTopic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedList1 {
  public static void main(String[] args) {

    Comparator<Integer> com = new Comparator<Integer>() {
      public int compare(Integer i, Integer j) {
        if (i % 10 > j % 10)
          return 1; // swap if value satisfied
        else
          return -1;
      }
    };

    List<Integer> nums = new ArrayList<>();
    nums.add(45);
    nums.add(11);
    nums.add(35);
    nums.add(22);
    nums.add(88);
    nums.add(69);

    Collections.sort(nums, com);
    System.out.println(nums);
  }
}
