package baekjoon.java;

public class SelfNumber {
  public static void main(String[] args) {
    boolean[] resultAry = new boolean[10001];
    for(int i=1; i < 10001; i++) {
      int sumNum = d(i);
      if(sumNum < 10001) {
        resultAry[sumNum] = true;
      }
    }
    for(int i=1; i < 10001; i++) {
      if(!resultAry[i]) {
        System.out.println(i);
      }
    }
  }
  public static int d(int n) {
    int sum = n;
    while(n != 0) {
      sum = sum + (n % 10);
      n = n / 10;
    }
    return sum;
  }
}