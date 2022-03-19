package baekjoon.java;

import java.util.Scanner;

public class BOJ_3053 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double a = Math.PI * N * N;
    double b = N * N * 2;
    System.out.println(String.format("%.6f", a));
    System.out.println(String.format("%.6f", b));
  }
}
