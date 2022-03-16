package baekjoon.java;
import java.util.Scanner;

public class BOJ_2908 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String str2 = sc.next();
    String[] strArray = str.split("");
    String[] strArray2 = str2.split("");
    String tem = strArray[0];
    String tem2 = strArray2[0];

    strArray[0] = strArray[2];
    strArray2[0] = strArray2[2];

    strArray[2] = tem;
    strArray2[2] = tem2;
    if(Integer.parseInt(String.join("", strArray)) > Integer.parseInt(String.join("", strArray2))) 
      System.out.println(String.join("", strArray));
    else 
      System.out.println(String.join("", strArray2));
  }
}
