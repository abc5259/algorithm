package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOJ_2108 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[8001];
    int[] arr2 = new int[N];
    int sum = 0;
    int max = 0;
    for(int i=0; i<N; i++) {
      int a = Integer.parseInt(br.readLine());
      arr[a + 4000]++;
      if(max < arr[a + 4000]) max = arr[a + 4000];
      sum += a;
      arr2[i] = a;
    }
    Arrays.sort(arr2);
    // 산술평균 
    sb.append(Math.round((double)sum / N)).append('\n');
    // 중앙값 
    sb.append(arr2[N/2]).append('\n');
    // 최빈값 
    List<Integer> arr3 = new ArrayList<>();
    for(int i=0; i<8001; i++) {
      if(arr[i] == max) arr3.add(i - 4000);
    }
    if(arr3.size() == 1) {
      sb.append(arr3.get(0)).append('\n');
    }else {
      sb.append(arr3.get(1)).append('\n');
    }
    //범위 
    sb.append(arr2[N-1] - arr2[0]);
    System.out.println(sb);

  }
}
