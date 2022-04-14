package baekjoon.java;

import java.util.Scanner;

public class BOJ_17087 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int S = sc.nextInt();
    int[] arr = new int[N];
    for(int i = 0; i < N; i++) {
      int num = sc.nextInt();
      arr[i] = Math.abs(S - num);
    }
    int min = arr[0];
    for(int i = 0; i < N-1; i++) {
      if(gcd(arr[i], arr[i+1]) < min) min = gcd(arr[i], arr[i+1]);
    }
    System.out.println(min);
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
