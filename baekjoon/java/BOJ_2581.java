package baekjoon.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_2581 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int N = sc.nextInt();
    int sum = 0;
    List<Integer> integerArray = new ArrayList<Integer>();
    for(int i=M; i<=N; i++){
      int cnt = 0;
      if(i==1) continue; 
      for(int j=1; j<=Math.ceil(i/2); j++){
        if(i % j == 0) cnt++;
      }
      if(cnt == 1){
        sum += i;
        integerArray.add(i);
      }
    }
    if(integerArray.size() == 0) System.out.println(-1);
    else {
      System.out.println(sum);
      System.out.println(integerArray.get(0));
    }
  }
}