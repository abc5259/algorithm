package baekjoon.java;

import java.util.Scanner;

public class BOJ_2164 {
  public static int rear = -1;
  public static int front = -1;
  public static int size = 0;
  public static int[] queue;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    int N = sc.nextInt();
    queue = new int[N];
    for(int i=N; i>=1; i--) {
      push(i); 
    }
    while(size != 1) {
      pop();
    }
  }
  public static void push(int item) {
    rear++;
    size++;
    queue[rear] = item;
  }
  public static int pop() {
    if(!empty()) {
      front++;
      size--;
      return queue[front];
    }else {
      return -1;
    }
  }
  public static boolean empty() {
    if(size() == 0) {
      return true;
    }else {
      return false;
    }
  }
  public static int size() {
    return size;
  }
}
