package baekjoon.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FastAB {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringTokenizer ab;
    int t = Integer.parseInt(bf.readLine()); 
    for(int i = 0; i < t; i++) {
      ab = new StringTokenizer(bf.readLine());
      bw.write(Integer.parseInt(ab.nextToken()) + Integer.parseInt(ab.nextToken()) + "\n");
    }
    bw.close();
  }
}
