package baekjoon.java;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2775 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int i=0; i< T; i++){
      int k = sc.nextInt(); //층
      int n = sc.nextInt(); //호수 
      int[][] apat = new int[k+1][n];
      for(int f=0; f<=k; f++) {
        for(int h=0; h<n; h++) {
          if(h == 0) {
            apat[f][h] = 1;
            continue;
          }
          if(f == 0) {
            apat[f][h] = apat[f][h-1] + 1; 
            continue;
          }
          int sum = 0;
          for(int g = 0; g <=h; g++) {
            sum += apat[f-1][g];
          }
          apat[f][h] = sum;
        }
      }
      System.out.println(apat[k][n-1]);
    }
  }
}
