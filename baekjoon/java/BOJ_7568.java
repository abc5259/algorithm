package baekjoon.java;

import java.util.Scanner;

public class BOJ_7568 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] arr = new int[N][3]; 
    for(int i=0; i<N; i++) {
      arr[i][0] = sc.nextInt();
      arr[i][1] = sc.nextInt();
      arr[i][2] = 0;
    }
    for(int i=0; i<N; i++) {
      int cnt = 0;
      for(int j=i+1; j<N; j++) {
        if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
          cnt++;
        }
        else if(arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1]) {
          arr[j][2]++;
        }
      }
      arr[i][2] += cnt + 1;
    }
    for(int i=0; i<N; i++) {
      System.out.printf("%d ",arr[i][2]);
    }
    System.out.println();
  }
}
