package baekjoon.java;

import java.util.Scanner;

public class UpAverage {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double[] resultAry = new double[n];
    for(int i = 0; i < n; i++) {
      int totalStudent = sc.nextInt();
      int[] studentAry = new int[totalStudent];
      int sum = 0;
      for(int j = 0; j < totalStudent; j++) {
        studentAry[j] = sc.nextInt();
        sum += studentAry[j];
      }
      int average = sum / totalStudent;
      int upAverageLength = 0;
      for(int k = 0; k < totalStudent; k++) {
        if(average <  studentAry[k]) upAverageLength++;
      }
      resultAry[i] = (double)upAverageLength / totalStudent * 100;
    }
    for(int i = 0; i < resultAry.length; i++) {
      System.out.printf("%.3f%%%n", resultAry[i]);
    }
  }
}