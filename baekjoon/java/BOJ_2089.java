package baekjoon.java;

import java.util.*;

public class BOJ_2089 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();
    int n = sc.nextInt();
    if(n == 0) 
      System.out.println(n);
    while(n != 0) {
      list.add(Math.abs(n%-2));
      n = (int)Math.ceil((double)n / -2);
    }
    for(int i=list.size()-1; i>=0; i--)
      System.out.print(list.get(i));
  }
}
