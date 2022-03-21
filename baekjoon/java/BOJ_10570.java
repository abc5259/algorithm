package baekjoon.java;

import java.util.Scanner;

public class BOJ_10570 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n+1];
    for(int i=0; i < arr.length; i++) {
      if(i < 2) {
        arr[i] = i;
        continue;
      }
      arr[i] = arr[i-1] + arr[i-2];
    }
    System.out.println(arr[n]);
  }
}
