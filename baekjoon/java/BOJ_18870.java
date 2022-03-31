package baekjoon.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class BOJ_18870 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    int N = sc.nextInt();
    int[] arr = new int[N];
    int[] sorted = new int[N];
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for(int i=0; i<arr.length; i++) {
      arr[i] = sorted[i] = sc.nextInt();
    }
    Arrays.sort(sorted);
    int rank = 0;
    for(int item:sorted) {
      if(!hashMap.containsKey(item)) {
        hashMap.put(item, rank);
        rank++;
      }
    }
    for(int i=0; i<arr.length; i++) {
      sb.append(hashMap.get(arr[i])).append(" ");
    }
    System.out.println(sb);
  }
}
