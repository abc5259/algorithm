package baekjoon.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberCount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    String multiply = a * b * c + "";
    List<String> integerArray = Arrays.asList(multiply.split(""));
    for(int i = 0; i < 10; i++) {
      System.out.println(Collections.frequency(integerArray, i + ""));
    }
  }
}
