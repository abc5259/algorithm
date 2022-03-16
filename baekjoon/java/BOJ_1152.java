package baekjoon.java;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1152 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String[] strArray = str.split(" ");
    System.out.println(Arrays.toString(strArray));
    if(strArray.length > 1 && strArray[0] == "") {
      System.out.println(strArray.length - 1);
    }else {
      System.out.println(strArray.length);
    }
  }
}
