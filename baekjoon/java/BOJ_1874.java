package baekjoon.java;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_1874 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    int N = sc.nextInt();
    Stack<Integer> stack = new Stack<>();
    int cnt = 1;
    boolean result = true;
    for(int i =0; i<N; i++) {
      int num = sc.nextInt();
      while(true) {
        if (cnt > N + 1) {
          result = false;
          break;
        }
        if(!stack.empty() && stack.lastElement() == num) {
          stack.pop();
          sb.append("-").append("\n");
          break;
        }
        stack.push(cnt);
        sb.append("+").append("\n");
        cnt++;
      }
    }
    if(result) {
      System.out.println(sb);
    }else {
      System.out.println("NO");
    }
  }
}
