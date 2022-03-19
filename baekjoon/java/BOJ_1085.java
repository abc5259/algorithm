package baekjoon.java;

import java.util.Scanner;

public class BOJ_1085 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int w = sc.nextInt();
    int h = sc.nextInt();
    int[] ary = new int[4];
    ary[0] = h - y;
    ary[1] = w - x;
    ary[2] = x;
    ary[3] = y;
    int min = ary[0];
    for(int item:ary) {
      if(item < min) min = item;
    }
    System.out.println(min);
  }
}
