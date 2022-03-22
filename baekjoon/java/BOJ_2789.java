package baekjoon.java;

import java.util.Scanner;

public class BOJ_2789 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] arr = new int[N];
    int max = 0;
    for(int i=0; i<N; i++) {
      arr[i] = sc.nextInt();
    }
    for(int i=0; i<arr.length-2; i++) {
      for(int j=i+1; j<arr.length-1; j++) {
        for(int k=j+1; k<arr.length; k++) {
          int sum = arr[i] + arr[j] + arr[k];
          if(M >= sum && max < sum) max =  sum;
        }
      }
    }
    System.out.println(max);
  }
}