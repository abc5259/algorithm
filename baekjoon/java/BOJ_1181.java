package baekjoon.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class BOJ_1181 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    int N = sc.nextInt();
    String[] arr = new String[N];
    for(int i=0; i<N; i++) {
      arr[i] = sc.next();
    }
    HashSet<String> hashSet = new HashSet<>(Arrays.asList(arr));
    String[] resultArr = hashSet.toArray(new String[0]);

    Arrays.sort(resultArr,(e1,e2) -> {
      if(e1.length() == e2.length()) {
        return e1.compareTo(e2);
      }else {
        return e1.length() - e2.length();
      }
    });
    for(int i=0; i<resultArr.length; i++) {
      sb.append(resultArr[i]).append("\n");
    }
    System.out.println(sb);
  }
}
