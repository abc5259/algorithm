package baekjoon.java;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_4949 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    while(true) {
      String arr = sc.nextLine();
      if(arr.equals(".")) break;
      Stack<String> stack = new Stack<>();
      String result = "yes";
      for(int i=0; i<arr.length(); i++) {
        if(arr.charAt(i) == '(') {
          stack.push("(");
        }
        else if(arr.charAt(i) == '[') {
          stack.push("[");
        }
        else if(arr.charAt(i) == ')') {
          if(stack.empty()) {
            result = "no";
          }
          else if(!stack.lastElement().equals("(")){
            result = "no";
          }else {
            stack.pop();
          }
        }
        else if(arr.charAt(i) == ']') {
          if(stack.empty()) {
            result = "no";
          }
          else if(!stack.lastElement().equals("[")){
            result = "no";
          }else {
            stack.pop();
          }
        }
      }
      if(result == "no") {
        sb.append(result).append("\n");
      }else {
        if(stack.empty()) {
          sb.append("yes").append("\n");
        }else {
          sb.append("no").append("\n");
        }
      }

    }
    System.out.println(sb);
  }
}
