package baekjoon.java;

public class NSum {
  public static void main(String[] args) {
    
  }
  static long sum(int[] a) {
    int result = 0;
    for(int i=0; i<a.length; i++) {
      result += a[i];
    }
    return result;
  }
}
