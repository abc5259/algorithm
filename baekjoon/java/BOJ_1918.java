package baekjoon.java;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class BOJ_1918 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    Stack<Character> operationStack = new Stack<>();
    HashMap<Character,Integer> hashMap = new HashMap<>();
    hashMap.put('(', -1);
    hashMap.put('+', 0);
    hashMap.put('-', 0);
    hashMap.put('/', 1);
    hashMap.put('*', 1);
    String str = sc.next();
    for(int i=0; i<str.length(); i++) {
      char c = str.charAt(i);
      if(65 <= c && c <=122) {
        sb.append(c);
      }
      else {
        if (c == '(') {
          operationStack.push(c);
        }
        else if(c == ')'){
          while(!operationStack.empty() && operationStack.peek() != '(') {
            sb.append(operationStack.pop());
          }
          if(!operationStack.empty()) operationStack.pop();
        }
        else {
          while(!operationStack.isEmpty() && hashMap.get(c) <= hashMap.get(operationStack.peek())) {
            sb.append(operationStack.pop());
          }
          operationStack.push(c);
        }
      }
    }
    while(!operationStack.isEmpty()) {
      sb.append(operationStack.pop());
    }
    System.out.println(sb);
  }
}
