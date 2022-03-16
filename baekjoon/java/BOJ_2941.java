package baekjoon.java;

import java.util.Scanner;

public class BOJ_2941 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String[] croArray = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    int sum = 0;
    String str = "";
    for(int i=0; i< s.length(); i++) {
      str += s.charAt(i);
      for(String cro:croArray) {
        if(str.contains(cro)) {
          sum += str.length() - cro.length() + 1;
          str = "";
          break;
        } 
      }
      if(i == s.length() - 1) sum += str.length();
    }
    System.out.println(sum);
  }
}