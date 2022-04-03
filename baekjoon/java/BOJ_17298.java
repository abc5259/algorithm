package baekjoon.java;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_17298 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    int N = sc.nextInt();
    int[] arr = new int[N];
    Stack<Integer> stack = new Stack<>();
    for(int i=0; i<N; i++){
      arr[i] = sc.nextInt();
    }
    for(int i=0; i<N; i++) {
      while(!stack.empty() && arr[stack.peek()] < arr[i]) {
        arr[stack.pop()] = arr[i];
      }
      stack.push(i);
    }
    while(!stack.isEmpty()) {
			arr[stack.pop()] = -1;
		}
    for(int i = 0; i < N; i++) {
			sb.append(arr[i]).append(' ');
		}
    System.out.println(sb);
  }
}
