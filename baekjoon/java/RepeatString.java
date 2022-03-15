package baekjoon.java;

import java.util.Scanner;

public class RepeatString {
  public static void main(String[] args) {
    // 입력: 문자열 S
    // ABC이고 2번반복이면 각 문자를 2번씩 반복해서 AABBCC를 만들면된다.
    // 알고리즘
    // 문자열을 돌면서 각 문자마다 반복되는 숫자만큼 새로운 문자열을 만들어서 해당 인덱스를 바꿔준다.
    // 그럴려면 문자열을 돌릴때 문자열을 돌리는 것이 아닌 배열로 만들어서 돌려야한다.
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i=0; i<t; i++) {
      int repeatNum = sc.nextInt();
      String str = sc.next();
      String[] strArray = str.split("");
      for(int j = 0; j < strArray.length; j++) {
        String newItem = "";
        for(int k = 0; k <repeatNum; k++) {
          newItem += strArray[j];
        }
        strArray[j] = newItem;
      }
      for(String result: strArray) {
        System.out.print(result);
      }
      System.out.println("");
    }
    
  }
}
