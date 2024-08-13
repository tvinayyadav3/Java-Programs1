
import java.lang.Math;

public class Question4 {
  public static void main(String[] args) {
    int start = 8, temp = start;
    int rows = 4;
    System.out.println(start);
    for (int i = 1; i <= rows - 1; i++) {
      temp = temp * 2;
      start = temp;
      for (int j = 1; j <= Math.pow(2, i); j++) {
        System.out.print(start++ + " ");
      }
      System.out.println();
    }
  }
}