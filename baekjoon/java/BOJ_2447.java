package baekjoon.java;

import java.util.Scanner;

public class BOJ_2447 {
  static StringBuffer sb = new StringBuffer();
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for(int i=1; i<=N; i++) {
      Loop:for(int j=1; j<=N; j++) {
        int copyN = N;
        while(true) {
          if(copyN == 3) break;
          copyN = copyN /3;
          if(j % copyN > (copyN - copyN/3)/2 && j% copyN <= (copyN - copyN/3) && i% copyN > (copyN - copyN/3)/2 && i% copyN <= (copyN - copyN/3)) {
            sb.append(" ");
            continue Loop;
          }
        }
        if(j > (N - N/3)/2 && j <= (N - N/3) && i > (N - N/3)/2 && i <= (N - N/3)) {
          sb.append(" ");
          continue;
        }
        sb.append("*");
      } 
      sb.append("\n");
    }
    System.out.println(sb.toString());
  }
}
