package baekjoon.java;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_9012 {
  public static int top = -1;
  public static ArrayList<String> items;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    int N = sc.nextInt();
    for(int i=0; i<N; i++) {
      top = -1;
      String[] arr = sc.next().split("");
      items = new ArrayList<>();
      String result = "YES";
      for(int j=0; j<arr.length; j++) {
        if(arr[j].equals("(")) {
          push("(");
        }else {
          if(is_empty()) {
            result = "NO";
            break;
          }
          pop();
        }
      }
      if(result.equals("NO")) {
        sb.append("NO").append("\n");
      }else {
        if(items.size() > 0) {
          sb.append("NO").append("\n");
        }else {
          sb.append("YES").append("\n");
        }
      }
    }
    System.out.println(sb);
  }
  public static boolean is_full() {
    if(top >= items.size() - 1) {
      return false;
    }else {
      return true;
    }
  }
  public static boolean is_empty() {
    if(top == -1) {
      return true;
    }else {
      return false;
    }
  }
  public static void pop() {
    if(!is_empty()) {
      items.remove(top);
      top--;
    }
  }
  public static void push(String item) {
    if(!is_full()) {
      top++;
      items.add(item);
    }
  }
}
