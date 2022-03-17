package baekjoon.java;

import java.util.Scanner;

public class BOJ_10250 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int i = 0; i < T; i++) {
      int H = sc.nextInt(); // 호텔 층 수
      int W = sc.nextInt(); // 각 층의 방 수
      int N = sc.nextInt(); // 몇 번째 손님인지 
      // 6 12 10
      int sum = 0;
      Loop: for (int j = 1; j <= W; j++) {
        for (int k = 1; k <= H; k++) {
          sum++;
          if(sum == N) {
            String room = j > 9 ? "" + j : "0" + j;
            System.out.println(k + "" + room);
            break Loop;
          }
        }
      }
    }
  }
}
