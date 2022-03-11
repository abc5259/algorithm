package baekjoon.java;

import java.util.Scanner;

public class Star {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String star = "";
    for(int i = 1; i < n + 1; i++) {
      star = star + "*";
      for(int j = n - i; j > 0; j--) {
        System.out.printf(" ");
      }
      System.out.println(star);
    }
  }
}

