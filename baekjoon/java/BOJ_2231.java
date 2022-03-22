package baekjoon.java;

import java.util.Scanner;

public class BOJ_2231 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int result = 0;
    for(int i=1; i<N; i++) {
      int sum = i;
      String[] arr = (i + "").split("");
      for(int j=0; j<arr.length; j++) {
        sum += Integer.parseInt(arr[j]);
      }
      if(sum == N) {
        result = i;
        break;
      }
    }
    System.out.println(result);
  }
}
