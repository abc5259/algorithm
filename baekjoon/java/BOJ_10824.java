package baekjoon.java;

import java.util.Scanner;

public class BOJ_10824 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] arr = sc.nextLine().split(" ");
    long num = Long.parseLong(arr[0] + arr[1]);
    long num2 = Integer.parseInt(arr[2] + arr[3]);
    System.out.println(num + num2);
  }
}
