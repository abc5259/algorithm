package baekjoon.java;

import java.util.Scanner;

public class BOJ_17013 {
  public static boolean[] prime;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    int T = sc.nextInt();
    prime = new boolean[1000001];
    make_prime();
    for(int i=0; i<T; i++) {
      int num = sc.nextInt();
      int cnt = 0;
      for(int j=2; j<=Math.ceil(num/2); j++) {
        if(!prime[j] && !prime[num - j]) cnt++;
      }
      sb.append(cnt).append("\n");
    }
    System.out.println(sb);
  }
  static void make_prime() {
    prime[0] = prime[1] = true;
    for(int i=2; i<=Math.sqrt(prime.length); i++) {
      if(prime[i]) continue;
      for(int j= i*i; j<prime.length; j +=i) {
        prime[j] = true;
      }
    }
  } 
}
