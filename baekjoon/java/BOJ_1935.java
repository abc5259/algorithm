package baekjoon.java;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BOJ_1935 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String s = sc.next();
    Stack<Double> stack = new Stack<>();
    double[] arr = new double[65 + N];
    for(int i = 0; i<N; i++) {
      arr[65 + i] = sc.nextInt();
    }
    for(int i = 0; i < s.length(); i++) {
      char input = s.charAt(i);
      if(input == '+') {
        double num = stack.pop() + stack.pop();
        stack.push(num);
      }
      else if(input == '-') {
        double firstPop = stack.pop();
        double secondPop = stack.pop();
        double num = secondPop - firstPop;
        stack.push(num);
      }
      else if(input == '*') {
        double num = stack.pop() * stack.pop();
        stack.push(num);
      }
      else if(input == '/') {
        double firstPop = stack.pop();
        double secondPop = stack.pop();
        double num = secondPop / firstPop;
        stack.push(num);
      }
      else {
        stack.push(arr[input]);
      }
    }
    System.out.printf("%.2f\n", stack.pop());
  }
}
