package Arrys;

public class Random {
  public static void main(String[] args) {
    int arr[][] = new int[4][4];

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        arr[i][j] = (int) (Math.random() * 10);
      }
    }

    // for (int i = 0; i < 4; i++) {
    // for (int j = 0; j < 4; j++) {
    // System.out.print(arr[i][j] + " ");
    // }
    // System.out.println();
    // }

    for (int n[] : arr) {
      for (int m : n) {
        System.out.print(m + " ");
      }
      System.out.println();
    }

  }
}

// for (int n[] : arr) {
// for (int m : n) {
//
// System.out.println(m + " ");
// }
// System.out.println();
// }