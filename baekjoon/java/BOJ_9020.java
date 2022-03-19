package baekjoon.java;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_9020 {
  public static boolean[] prime;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int i =0; i<T; i++) {
      int N = sc.nextInt();
      prime_number(N);
      int min = 0;
      int prev_prime = 2;
      for(int j=2; j<prime.length; j++) {
        if(!prime[j]) {
          int nextPrime = Math.abs(N - j);
          if(prime[nextPrime]) continue;
          if(nextPrime-j < min || nextPrime-j == 0) {
            min = nextPrime-j;
            prev_prime = j;
            break;
          }
        }
      }
      System.out.printf("%d %d%n", N - prev_prime, prev_prime);
  }
  }
  public static void prime_number(int N) {
    prime = new boolean[N + 1];
    prime[0] = prime[1] = true;
    for(int i=2; i<=Math.sqrt(prime.length); i++) {
      for(int j=i*i; j<prime.length; j+=i) {
        if(prime[j]) continue;
        prime[j] = true;
      } 
    }
  }
}
