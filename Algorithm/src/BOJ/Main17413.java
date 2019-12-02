package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main17413 {
	
	static void print(BufferedWriter bw, Stack<Character> s) throws IOException {
		while(!s.isEmpty())
			bw.write(s.pop());
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> s = new Stack<Character>();
		boolean tag = false; //태그인지 판명
		
		String str = br.readLine();
		for(char c : str.toCharArray()) {
			if(c=='<') {
				print(bw,s);
				tag = true;
				bw.write(c);
			}
			else if(c=='>') {
				tag = false;
				bw.write(c);
			}
			else if(tag) {
				bw.write(c);
			}
			else {
				if(c==' ') { // 공백
					print(bw,s);
					bw.write(c);
				}
				else {
					s.push(c);
				}
			}
		}
		bw.close();
	}
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		String[] str = br.readLine().split("");
//		Stack<String> s = new Stack<String>();
//		int su = 0;
//		int len = str.length;
//		System.out.println(len);
//		for(int i=0;i<len;i++) {
//			if(str[i].equals("<")){
//				if(!s.isEmpty()) {
//					while(!s.isEmpty()) bw.write(s.pop());
//				}
//				su = i;
//				bw.write(str[su]);
//				while(!(str[su].equals(">"))) {
//					su++;
//					bw.write(str[su]);
//				}
//				i=su;
//			}
//			else {
//				if(str[i].equals(" ")) {
//					while(!s.isEmpty()) bw.write(s.pop());
//					bw.write(" ");
//				}
//				else {
//					s.push(str[i]);
//				}
//			}
//		}
//		while(!s.isEmpty()) bw.write(s.pop());
//		bw.close();
//
//	}

}
