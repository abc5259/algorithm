package baekjoon.java;

import java.util.Scanner;

public class BOJ_2839 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    if(N%5%3 == 0) {
      System.out.println((N/5) + (N%5/3));
    }else {
      int rest = N%5; //1
      int five = (N/5);
      while(true) {
        if(rest % 3 == 0) break;
        if(five < 0) break;
        rest += 5; //6
        five--;  //1
      }
      if(five >= 0) System.out.println(five + (rest / 3));
      else System.out.println(-1);
    }
  }
}
