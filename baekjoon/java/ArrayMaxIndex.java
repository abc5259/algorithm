package baekjoon.java;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxIndex {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a =  new int[9];
    for(int i=0; i < 9; i++) {
      a[i] = sc.nextInt();
    }
    int max = a[0];
    int maxIndex = 0;
    for(int i=1; i < 9; i++) {
      if(a[i] > max) {
        max = a[i];
        maxIndex = i;
      }
    }
    System.out.println(max);
    System.out.println(maxIndex + 1);
  }
}
