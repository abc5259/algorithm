package baekjoon.java;

import java.util.Scanner;

public class BOJ_4948 {
  public static boolean[] prime;
  public static void main(String[] args) {
    // n보다 크, 2n보다 작거나 같은 소수는 적어도 하나 존재한다
    Scanner sc = new Scanner(System.in);
    int N = -1;
    while(true) {
      N = sc.nextInt();
      if(N == 0) break;
      prime_number(2*N);
      int sum = 0;
      for(int j=N+1; j<=2*N; j++) {
        if(!prime[j]) sum++;
      }
      System.out.println(sum);
    }
    
  }
  public static void prime_number(int N) {
    prime = new boolean[N + 1];
    prime[0] = prime[1] = true;
    for(int i=2; i<=Math.sqrt(prime.length); i++) {
      for(int j=i*i; j <prime.length; j+=i) {
        if(prime[j]) continue;
        prime[j] = true;
      }
    }
  }
}
