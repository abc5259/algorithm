package baekjoon.java;

import java.util.Scanner;

public class BOJ_1018 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    boolean[][] arr = new boolean[N][M];
    for(int i=0; i<N; i++) {
      String s = sc.next();
      for(int j=0; j<M; j++) {
        arr[i][j] = s.charAt(j) == 'W' ? true : false;
      }  
    }
    int min = 1000000000;
    for(int i=0; i<N-7; i++) {
      for(int j=0; j<M-7; j++) {
        int sum = 0;
        boolean TF = arr[i][j];
        for(int k=i; k < 8+i; k++) {
          for(int l=j; l < 8+j; l++) {
            if (arr[k][l] != TF) {	
              sum++;
            }
            TF = (!TF);
          } 
          TF = !TF;
        }
        sum = Math.min(sum, 64 - sum);
        if(min > sum) min = sum;
      }  
    }
    System.out.println(min);
  }
}
