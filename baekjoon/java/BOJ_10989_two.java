package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10989_two {
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[10001];
    for(int i=0; i<N; i++) {
      arr[Integer.parseInt(br.readLine())]++;
    }

    for(int i=0; i<N; i++) {
      if(arr[i] > 0) {
        int cnt = arr[i];
        while(true) {
          if(cnt == 0) break;
          sb.append(i).append("\n");
          cnt--;
        }
      }
    }
    System.out.println(sb);
  }
}
