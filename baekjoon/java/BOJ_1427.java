package baekjoon.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_1427 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    String[] arr = sc.next().split("");
    Integer[] arr2 = new Integer[arr.length];
    for(int i=0; i<arr.length; i++) {
      arr2[i] = Integer.parseInt(arr[i]);
    }
    Arrays.sort(arr2,Collections.reverseOrder());
    for (int i : arr2) {
      sb.append(i);
    }
    System.out.println(sb);
  }
}
