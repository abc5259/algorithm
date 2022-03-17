package baekjoon.java;

import java.util.Scanner;

public class BOJ_2869 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 낮에는 A만큼 올라가고 밤에는 B만큼 내려간다
    int A = sc.nextInt();
    int B = sc.nextInt();
    int V = sc.nextInt();
    int result = 1;
    int go = V - A;
    int canOneGo = A - B;
    if(go == 0) System.out.println(result);
    else if(go <= canOneGo) System.out.println(++result);
    else System.out.println(go /canOneGo + 1 + (int)(go % canOneGo));
  }
}
