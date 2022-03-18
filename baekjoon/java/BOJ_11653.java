package baekjoon.java;
import java.util.Scanner;

public class BOJ_11653 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for(int i = 2; i <= Math.ceil(N); i++) {	// 또는 i * i <= N
      while(N % i == 0) {
        System.out.println(i);
        N /= i;
      }
    }
     
    if(N != 1) {
      System.out.println(N);
    }
  }
}