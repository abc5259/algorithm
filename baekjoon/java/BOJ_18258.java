package baekjoon.java;

import java.util.Scanner;

public class BOJ_18258 {
  public static int[] arr;
  public static int rear = -1;
  public static int front = -1;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    int N = sc.nextInt();
    arr = new int[N];
    for(int i=0; i<N; i++) {
      switch(sc.next()) {
        case "push": {
          push(sc.nextInt());
          break;
        }
        case "pop": {
          sb.append(pop()).append("\n");
          break;
        }
        case "size": {
          sb.append(size()).append("\n");
          break;
        }
        case "empty": {
          sb.append(empty() ? 1 : 0).append("\n");
          break;
        }
        case "front": {
          sb.append(front()).append("\n");
          break;
        }
        case "back": {
          sb.append(back()).append("\n");
          break;
        }
      }
    }
    System.out.println(sb);
  }
  public static void push(int item) {
    rear++;
    arr[rear] = item;
  }
  public static int pop() {
    if(!empty()) {
      front++;
      return arr[front];
    }else {
      return -1;
    }
  }
  public static int size() {
    if(front == -1) {
      return rear + 1;
    }else {
      return rear - front;
    }
  }
  public static boolean empty() {
    if(size() == 0) {
      return true;
    }else {
      return false;
    }
  }
  public static int front() {
    if(!empty()) {
      return arr[front + 1]; 
    }else {
      return -1; 
    }
  }
  public static int back() {
    if(!empty()) {
      return arr[rear]; 
    }else {
      return -1; 
    }
  }
}
