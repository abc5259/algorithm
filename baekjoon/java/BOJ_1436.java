package baekjoon.java;

import java.util.Scanner;

public class BOJ_1436 {
  public static void main(String[] args) {
    // 9666 10666 11666 12666 13666 19666 16661 16666
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int result = 0;
    int T = 666;
    int cnt = 0;
    int i = -1;
    while(true) {
      i++;
      if(!((T + i) + "").contains("666")) continue;
      else {
        cnt++;
        result = T + i;
      }
      if(cnt == N) break;
    }
    System.out.println(result);
  }
}
