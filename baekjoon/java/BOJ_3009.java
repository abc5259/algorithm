package baekjoon.java;

import java.util.Scanner;

public class BOJ_3009 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int c = sc.nextInt();
    int d = sc.nextInt();

    int e = sc.nextInt();
    int f = sc.nextInt();
    // ac ae ce
    int x = a == c ? e : a == e ? c : a;
    int y = b == d ? f : b == f ? d : b;
    System.out.printf("%d %d%n",x,y);
  }
}
