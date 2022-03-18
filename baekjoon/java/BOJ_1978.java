package baekjoon.java;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_1978 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sum = 0;
    for(int i=0; i<N; i++) {
      int num = sc.nextInt();
      if(num == 1) {
        continue;
      }
      int cnt = 0;
      for(int j=1; j<=num/2; j++) {
        if(num % j == 0) cnt++;
      }
      sum = cnt == 1 ? sum + 1 : sum;
    }
    System.out.println(sum);
  }
}
