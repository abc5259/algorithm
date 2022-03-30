package baekjoon.java;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10814 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    int N = sc.nextInt();
    Player[] players = new Player[N];
    for(int i=0; i<N; i++) {
     players[i] = new Player(sc.nextInt(), sc.next());
    }
    Arrays.sort(players, (a,b) -> {
      return a.age - b.age;
    });
    for(int i=0; i<N; i++) {
      sb.append(players[i].age + " " + players[i].name).append("\n");
    }
    System.out.println(sb);
  }
  public static class Player {
    int age;
    String name;
    public Player(int age, String name) {
      this.age = age;
      this.name = name;
    }
  }
}
