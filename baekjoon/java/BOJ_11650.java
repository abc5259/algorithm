package baekjoon.java;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_11650 {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    int N = sc.nextInt();
    int[][] arr = new int[N][2];
    for(int i=0; i<N; i++) {
      arr[i][0] = sc.nextInt();
      arr[i][1] = sc.nextInt();
    }
    Arrays.sort(arr, (e1, e2) -> {
      System.out.println(e1 + " " +e2);
      if(e1[0] == e2[0]) {
        return e1[1] - e2[1];
      }
      else {
        return e1[0] - e2[0];
      }
    });
    for(int i=0; i<N; i++) {
      sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
    }
    System.out.println(sb);
  }
}
