package baekjoon.java;


import java.util.Scanner;

public class AlpaFind {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int[] result = new int[26];
    for(int i = 0; i<result.length; i++){
      char convertedChar = (char)(i + 97);
      for(int j = 0; j < s.length(); j++) {
        char str = s.charAt(j);
        if(convertedChar == str) {
          result[i] = j;
          break;
        }else {
          result[i] = -1;
        }
      }
      
    }
    for(int x : result) {
      System.out.print(x + " ");
    }
  }
}
