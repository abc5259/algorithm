package baekjoon.java;

import java.util.Scanner;

public class BOJ_6588 {
  public static boolean[] prime;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    prime = new boolean[1000001];
    make_prime();
    while((num = sc.nextInt()) != 0) {
      for(int i=2; i<=num; i++) {
        if(!prime[i] && !prime[num - i]) {
          System.out.printf("%d = %d + %d\n",num,i,num - i);
          break;
        }
      }
    }
  }
  public static void make_prime() {
    prime[0] = prime[1] = true;
    for(int i=2; i<=Math.sqrt(prime.length); i++) {
      if(prime[i]) continue;
      for(int j=i*i; j<prime.length; j+=i) {
        prime[j] = true;
      }
    }
  }
}
