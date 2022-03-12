package baekjoon.java;

import java.util.Scanner;

public class PlusCycle {
  public static void main(String[] args) {
    // 26 8 가장오른쪽 6 + 가장오른쪽 8 = 14 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cycleNumber = -1;
    int resultNumber = n;
    int sum = 0;
    while(cycleNumber != n) {
      // 8
      int plusNumber = (resultNumber / 10 + resultNumber % 10) % 10;
      // 6
      int RingthN = resultNumber % 10;
      resultNumber = RingthN * 10 + plusNumber;
      cycleNumber = resultNumber;
      sum++;
    }
    System.out.println(sum);
  }
}
// 26 14 9 18 17 15 11 