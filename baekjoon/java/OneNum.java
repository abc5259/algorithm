package baekjoon.java;

import java.util.Scanner;

public class OneNum {
  public static void main(String[] args) {
    // 연속된 두 개의 수의 차이가 일정한 수열
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum = 0;
    for(int i=1; i <= num; i++) {
      boolean isOneNum = oneNumCheck(i);
      if(isOneNum) {
        sum += 1;
      }
    }
    System.out.println(sum);
  }
  public static boolean oneNumCheck(int n) {
    if(n < 10) {
      return true;
    }
    else if (n < 100) {
      return true;
    }
    else if(n < 1000) {
      int n1 = n / 100;
      int n2 = n / 10 % 10;
      int n3 = n % 10;
      return n2 - n1 == n3 - n2 ? true : false;
    }else {
      return false;
    }
  }
}
