package baekjoon.java;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
  public static void main(String[] args) {
    // 점수의 최댓값 M
    // 모든 점수를 점수/M*100
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double arr[] = new double[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    double average = 0;
    for(int j = 0; j < n; j++) {
      arr[j] = arr[j] / arr[n-1] * 100 ;
      average += arr[j];
    }
    System.out.println(average / n);
  }
}
