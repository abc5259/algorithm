package baekjoon.java;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_5622 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    // String[] strArray = str.split("");
    int[] n = new int[26];
    for(int i =0; i < n.length; i++) {
      if(i < 3) n[i] = 3;
      else if (i < 6) n[i] = 4;
      else if (i < 9) n[i] = 5;
      else if (i < 12) n[i]  = 6;
      else if (i < 15) n[i]  = 7;
      else if (i < 19) n[i]  = 8;
      else if (i < 22) n[i]  = 9;
      else if (i < 26) n[i]  = 10;
    }
    int sum = 0;
    for(int i=0; i<str.length(); i++) {
      sum += n[str.charAt(i)- 'A'];
    }
    System.out.println(sum);
  }
}
