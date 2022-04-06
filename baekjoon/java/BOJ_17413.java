package baekjoon.java;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_17413 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    String str = sc.nextLine();
    Stack<Character> stack = new Stack<>();
    Stack<Character> stack2 = new Stack<>();
    boolean isWord = true;
    for(int i=0; i<str.length(); i++) {
      if(str.charAt(i) == '<') {
        while(!stack2.isEmpty()){
          stack.push(stack2.pop());
        }
        stack.push(str.charAt(i));
        isWord = false;
      }
      else if(str.charAt(i) == '>') {
        stack.push(str.charAt(i));
        isWord = true;
      }
      else if(isWord) {
        if(str.charAt(i) == ' '){
          while(!stack2.isEmpty()){
            stack.push(stack2.pop());
          }
          stack.push(str.charAt(i));
          continue;
        }
          stack2.push(str.charAt(i));
        } else {
          stack.push(str.charAt(i));
        }
    } 
    while(!stack2.isEmpty()){
      stack.push(stack2.pop());
    }
    for(char c:stack){
      sb.append(c);
    }
    System.out.println(sb);
  }
}
