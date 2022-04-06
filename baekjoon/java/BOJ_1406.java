package baekjoon.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ_1406 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String str = br.readLine();
    int N = Integer.parseInt(br.readLine());
    Stack<Character> leftStack = new Stack<>();
    Stack<Character> rightStack = new Stack<>();

		for(int i = 0; i < str.length(); i++) {
			leftStack.push(str.charAt(i));
		}

    for(int i = 0; i < N; i++) {
      String code = br.readLine();
      if(code.equals("L")) {
        if(!leftStack.isEmpty()){
          rightStack.push(leftStack.pop());
        }
      }else if(code.equals("D")) {
        if(!rightStack.isEmpty()){
          leftStack.push(rightStack.pop());
        }
      }else if(code.equals("B")) {
        if(!leftStack.isEmpty()){
          leftStack.pop();
        }
      }else if(code.charAt(0) == 'P') {
        char t = code.charAt(2);
        leftStack.push(t);
      }
    }
    while(!leftStack.isEmpty()){
      rightStack.push(leftStack.pop());
    }
    while(!rightStack.isEmpty()){
      bw.write(rightStack.pop());
    }
    bw.flush();
		bw.close();
  }
}
