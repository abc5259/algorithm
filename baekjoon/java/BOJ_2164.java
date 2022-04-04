package baekjoon.java;

import java.util.Scanner;

public class BOJ_2164 {
  public static int N;
  public static int rear = -1;
  public static int front = 0;
  public static int size = 0;
  public static int[] queue;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    queue = new int[N];
    for(int i=1; i<=N; i++) {
      push(i); 
    }
    while(size != 1) {
      pop();
      push(pop());
    }
    System.out.println(pop());
  }
  public static void push(int item) {
    rear++;
    size++;
    queue[rear % N] = item;
  }
  public static int pop() {
    if(!empty()) {
      size--;
      return queue[front++ % N];
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
