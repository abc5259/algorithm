package baekjoon.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Remain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] array = new String[10];
    for(int i = 0; i < array.length; i++) {
      int item = sc.nextInt();
      array[i] = item % 42 + "";
    }
    List<String> stringArray = new ArrayList<>(Arrays.asList(array));
    int sum = stringArray.size();
    
    for(int i = 0; i < stringArray.size() - 1; i++) {
      for(int j = i + 1; j < stringArray.size(); j++) {
        if(stringArray.get(i).equals(stringArray.get(j))) {
          sum = sum - 1;
          break;
        }
      }
    }
    System.out.println(sum);
  }
}
// 1 2