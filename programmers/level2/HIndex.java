package programmers.level2;

import java.util.Arrays;

public class HIndex {
  public static void main(String[] args) {
    int[] citations = {25, 8, 5, 3, 3};
    Arrays.sort(citations);
    int answer = citations.length;
    while(answer != 0) {      
      int cnt = 0;
      for(int i = citations.length - 1; i >=0; i--) {
        if(answer <= citations[i]) {
          cnt++;
        }
      }
      if(cnt >= answer) break;
      answer--;
    }
    System.out.println((answer));
  }
}