package baekjoon.java;

import java.util.Scanner;

public class BOJ_10808 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    String str = sc.next();
    int[] arr = new int[26];
    for(int i=0; i<str.length(); i++) {
      arr[ str.charAt(i) - 97]++;
    }
    for(int cnt:arr) {
      sb.append(cnt).append(" ");
    }
    System.out.println(sb);
  }
}
