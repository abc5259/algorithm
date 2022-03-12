package baekjoon.java;

import java.util.Scanner;

public class WhileA_B {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y =sc.nextInt();
    while(y != 0) {
      System.out.println(x+y);
      x = sc.nextInt();
      y = sc.nextInt();
    }
  }
}
