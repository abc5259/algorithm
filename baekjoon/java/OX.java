package baekjoon.java;
import java.util.Scanner;

public class OX {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] b = new int[n];
    for(int i = 0; i < n; i++) {
      String item = sc.next();
      String[] itemArray = item.split("");
      int result = 0;
      int sum = 0;
      for(int j = 0; j < itemArray.length; j++) {
        if(itemArray[j].equals("O")) {
          sum++;
          result += sum;
        } else {
          sum = 0;
        }
      }
      b[i] = result;
    }

    for(int i =0; i < b.length; i++) {
      System.out.println(b[i]);
    }
  }
}
