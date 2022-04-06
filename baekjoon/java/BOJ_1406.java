package baekjoon.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class BOJ_1406 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String str = br.readLine();
    int N = Integer.parseInt(br.readLine());
    LinkedList<Character> arr = new LinkedList<Character>();

		for(int i = 0; i < str.length(); i++) {
			arr.add(str.charAt(i));
		}

    int cursur = arr.size();
    for(int i = 0; i < N; i++) {
      String code = br.readLine();
      if(code.equals("L")) {
        if(cursur != 0) {
          cursur--;
        }
      }else if(code.equals("D")) {
        if(cursur != arr.size()) {
          cursur++;
        }
      }else if(code.equals("B")) {
        if(cursur != 0) {
          arr.remove(cursur - 1);
          cursur--;
        }
      }else if(code.charAt(0) == 'P') {
        char t = code.charAt(2);
        arr.add(cursur, t);
        cursur++;
      }
    }
    for(Character item:arr) {
      bw.write(item);
    }
    bw.flush();
		bw.close();
  }
}
