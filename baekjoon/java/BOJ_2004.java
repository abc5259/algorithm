package baekjoon.java;

import java.util.Scanner;

public class BOJ_2004 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    int t = sc.nextInt();
    for(int i=0; i<t; i++) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int j=0; j<n; j++) {
        arr[j] = sc.nextInt();
      }
      long sum = 0;
      for(int j=0; j<n-1; j++) {
        for(int k=j+1; k<n; k++) {
          sum += gcd(arr[j], arr[k]);
        }
      }
      sb.append(sum).append("\n");
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
