package baekjoon.java;


import java.util.Scanner;

public class WordExam {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next().toLowerCase();
    int[] result = new int[26];
    for(int i=0; i < str.length(); i++) {
      //해당 알파벳의 아스키코드값 - 97인덱스에 중복되는만큼 ++ 
      result[str.charAt(i) - 'a']++;
    }
    int repeat = 0;
    int max = -1;
    char maxChar = '?';
    for(int i =0; i < result.length; i++) {
      if(max < result[i]) {
        max = result[i];
        maxChar = (char)(i + 'A');
      }
      else if(max == result[i]) {
        maxChar = '?';
      }
    }
    System.out.println(maxChar);
  }
}
