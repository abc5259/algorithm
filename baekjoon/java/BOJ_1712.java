package baekjoon.java;

import java.util.Scanner;

public class BOJ_1712 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int dif = (C - B);
    int result = 0;
    if(dif <= 0) result = -1;
    else result = A / dif + 1;
    System.out.println(result);
  }
}
