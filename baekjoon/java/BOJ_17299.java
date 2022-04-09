package baekjoon.java;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_17299 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    int N = sc.nextInt();
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> numStack = new Stack<>();
    Stack<Integer> resultStack = new Stack<>();
    int[] list = new int[1000001];
    for(int i=0; i<N; i++) {
      int num = sc.nextInt();
      stack.push(num);
      list[stack.peek()]++;
    }
    while(!stack.empty()) {
      int key = stack.pop();
      int value = list[key];
      while(true) {
        if(numStack.empty()) {
          numStack.push(key);
          resultStack.push(-1);
          break;
        }
        if(list[numStack.peek()] > value) {
          resultStack.push(numStack.peek());
          numStack.push(key);
          break;
        }
        numStack.pop();
      }
    }
    while(!resultStack.isEmpty()) {
      sb.append(resultStack.pop()).append(" ");
    }
    System.out.println(sb);
  }
}
