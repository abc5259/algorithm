package baekjoon.java;

import java.util.*;

public class BOJ_2805 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] treeHeights = new int[N];
    int max = 0;
    int min = 0;
    for(int i=0; i<N; i++) {
      treeHeights[i] = sc.nextInt();
      if(treeHeights[i] > max) 
        max = treeHeights[i];
    }
    while(min < max) {
      int mid = (min + max) / 2;
      long sum = 0;
      for(int treeHeight: treeHeights) {
        if(treeHeight - mid > 0) {
          sum += treeHeight - mid;
        }
      }
      if(sum < M) 
        max = mid;
      else 
        min = mid + 1;
    }
    System.out.println(min - 1);
  }
}
