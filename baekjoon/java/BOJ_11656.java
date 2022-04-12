package baekjoon.java;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_11656 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    String str = sc.next();
    String[] arr = new String[str.length()];
    for(int i = 0; i < str.length(); i++) {
      String inputStr = "" + str.charAt(i);
      for(int j = i + 1; j < str.length(); j++) {
        inputStr += str.charAt(j);
      }
      arr[i] = inputStr;
    }
    Arrays.sort(arr);
    for(String s:arr) {
      sb.append(s).append("\n");
    }
    System.out.println(sb);
  }
}
