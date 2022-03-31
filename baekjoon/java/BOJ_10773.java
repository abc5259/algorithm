package baekjoon.java;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_10773 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    ArrayList<Integer> arrList = new ArrayList<>();
    for(int i=0; i<K; i++) {
      int value = sc.nextInt();
      if(value != 0) {
        arrList.add(value);
      }else {
        arrList.remove(arrList.size() - 1);
      }
    }
    int sum=0;
    for(int i=0; i<arrList.size(); i++) {
      sum += arrList.get(i);
    }
    System.out.println(sum);
  }
}
