package baekjoon.java;

import java.util.Scanner;

public class BOJ_1316 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    for(int i = 0; i < n; i++) {
      String str = sc.next();
      boolean result = true;
      for(int j=0; j < str.length(); j++) {
        String s = str.charAt(j) + "";
        int startIndex = str.indexOf(s);
        int endIndex = str.lastIndexOf(s);
        for(int k = startIndex; k <= endIndex; k++) {
          if(str.charAt(j) != str.charAt(k)) result = false;
        }
      }
      if(result) sum++;
    }
    System.out.println(sum);
  }
}
