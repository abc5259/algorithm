package baekjoon.java;

import java.util.Scanner;

public class BOJ_11729 {
  public static int cnt = 0;
  static StringBuffer sb = new StringBuffer();
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    hanoi_tower(n,'1','2','3');
    System.out.println(cnt);
    System.out.println(sb.toString());
  }
  public static int hanoi_tower(int n, char from, char temp, char to) {
    cnt++;
    if(n == 1) {
      // System.out.printf("%s %s%n",from,to);
      sb.append(from + " " + to + "\n");
    }
    else {
      hanoi_tower(n-1, from,to,temp);
      // System.out.printf("%s %s%n",from,to);
      sb.append(from + " " + to + "\n");
      hanoi_tower(n-1, temp,from,to);
    }
    return cnt;
  }
}
