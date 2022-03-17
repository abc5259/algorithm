package baekjoon.java;

import java.util.Scanner;

public class BOJ_2292 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = 1;
    int sum = 1;
    while(true) {
      if(sum >= n) break;
      sum += 6 * result;
      result++;
    }
    System.out.println(result);
  }
}
