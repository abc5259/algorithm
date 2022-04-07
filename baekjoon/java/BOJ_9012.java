package baekjoon.java;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_9012 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int N = sc.nextInt();
    for(int i=0; i<N; i++) {
      sb.append(result(sc.next())).append("\n");
    }
    System.out.println(sb);
  }
  public static String result(String str) {
    Stack<Character> stack = new Stack<>();
    for(int i=0; i<str.length(); i++) {
      if(str.charAt(i) == '(') {
        stack.push(str.charAt(i));
      }
      else if (stack.empty()) {
        return "NO";
      }
      else {
        stack.pop();
      }
    }
    if (stack.empty()) {
			return "YES";
		} 
		else {
			return "NO";
		}
  }
}
