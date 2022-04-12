package baekjoon.java;

import java.util.Scanner;

public class BOJ_1934 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    int N = sc.nextInt();
    for(int i=0; i<N; i++) {
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      sb.append(n1 * n2 / gcd(n1, n2)).append("\n");
    }
    System.out.println(sb);
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
