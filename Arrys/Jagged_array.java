package Arrys;

public class Jagged_array {
  public static void main(String[] args) {
    int arr[][] = new int[3][]; // Jagged array | cloumn size not fixed

    arr[0] = new int[3]; // first coloumn size is 3
    arr[1] = new int[4]; // first coloumn size is 4
    arr[2] = new int[2]; // first coloumn size is 2

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = (int) (Math.random() * 10);

      }
    }

    for (int n[] : arr) {
      for (int m : n) {
        System.out.print(m + " ");
      }
      System.out.println();

    }
  }
}
