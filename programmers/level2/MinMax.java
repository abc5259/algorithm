package programmers.level2;

import java.util.Arrays;

public class MinMax {
  public static void main(String[] args) {
    String s = "1 2 3 4";
    String[] arr = s.split(" ");
    Arrays.sort(arr, (x,y) -> Integer.parseInt(x) - Integer.parseInt(y));
    String answer = arr[0] + " " + arr[arr.length - 1];
    System.out.println(answer);
  }
}
