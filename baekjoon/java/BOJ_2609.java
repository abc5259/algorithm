package baekjoon.java;

import java.util.Scanner;

public class BOJ_2609 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int d = gcd(num1, num2);
    System.out.println(d);
    System.out.println(num1 * num2 / d);
  }
  public static int gcd(int a, int b) {
    while(b != 0) {
      int r = a % b;
      a = b;
      b = r;
    } 
    return a;
  }
}
