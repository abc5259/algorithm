package baekjoon.java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_11866 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    int N = sc.nextInt();
    int K = sc.nextInt();
    LinkedList<Integer> queue = new LinkedList<>();
    sb.append("<");
    for(int i=1; i<=N; i++) {
      queue.offer(i);
    }
    int index = 0;
    while(queue.size() > 0) {
      index = (index + K - 1) % queue.size();
      if(queue.size() > 1) {

        sb.append(queue.remove(index)).append(", ");
      }else {
        sb.append(queue.remove(index));
      }
    }
    sb.append(">");
    System.out.println(sb);
  }
}
