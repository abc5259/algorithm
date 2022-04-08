package baekjoon.java;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class BOJ_17299 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    int N = sc.nextInt();
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    Stack<Integer> stack3 = new Stack<>();
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for(int i=0; i<N; i++) {
      int num = sc.nextInt();
      stack.push(num);
      if(hashMap.containsKey(num)) {
        int value = hashMap.get(num);
        hashMap.put(num, ++value);
      }else {
        hashMap.put(num, 1);
      }
    }
    while(!stack.empty()) {
      //ㅔpop값과 pop아 key인값
      int pop = stack.pop();
      int value = hashMap.get(pop);
      while(!stack3.empty()) {
        int stack3_pop = stack3.pop();
        if(value < hashMap.get(stack3_pop)) {
          stack3.push(value);
          stack2.push(pop);
          System.out.println(stack3);
          break;
        }
      }
      System.out.println(stack3);
      if(stack3.empty()) {
        stack2.push(pop);
        stack3.push(value);
      }
    }
    System.out.println(stack2);
  }
}
