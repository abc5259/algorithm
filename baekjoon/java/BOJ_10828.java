package baekjoon.java;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_10828 {
  public static int top = -1;
  public static ArrayList<Integer> arrList = new ArrayList<>();
  public static StringBuffer sb = new StringBuffer();
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for(int i=0; i<N; i++) {
      String item = sc.next();
      if(item.equals("pop")) {
        pop();
      }
      else if(item.equals("size")) {
        sb.append(top + 1).append("\n");
      }
      else if(item.equals("empty")) {
        if(is_empty()) {
          sb.append(1).append("\n");
        }else {
          sb.append(0).append("\n");
        }
      }
      else if(item.equals("top")) {
        if(is_empty()) {
          sb.append(-1).append("\n");
        }else {
          sb.append(arrList.get(top)).append("\n");
        }
      }
      else if(item.equals("push")){
        int pushItem = sc.nextInt();
        push(pushItem);
      }
    }
    System.out.println(sb);
  }
  public static Boolean is_empty() {
    if(top == -1) return true;
    else return false;
  }
  public static void push(int item) {
    arrList.add(item);
    top++;
  }
  public static void pop() {
    if(is_empty()) {
      sb.append(-1).append("\n");
    }else {
      sb.append(arrList.get(top)).append("\n");
      arrList.remove(top);
      top--;
    }
  }
}
