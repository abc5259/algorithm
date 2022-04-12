package baekjoon.java;

import java.util.Scanner;

public class BOJ_11655 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    String str = sc.nextLine();
    for(int i=0; i<str.length(); i++) {
      char c = str.charAt(i);
      if(c >= 'A' && c <= 'Z') {
        if('A' + 26 - c <= 13) {
          sb.append((char)('A' + (13 - ('A' + 26 - c))));
        }else {
          sb.append((char)(c + 13));
        }
      }
      else if(c >= 'a' && c <= 'z') {
        if('a' + 26 - c <= 13) {
          sb.append((char)('a' + (13 - ('a' + 26 - c))));
        }else {
          sb.append((char)(c + 13));
        }
      }
      else {
        sb.append(c);
      }
    }
    System.out.println(sb);
  }
}
