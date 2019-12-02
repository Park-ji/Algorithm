package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main10799 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> s = new Stack<Character>();
		String str = br.readLine();
		int len = str.length();
		char ch[] = new char[len];
		for(int i=0;i<len;i++) {
			ch[i] = str.charAt(i);
		}
		int cnt = 0;//나무 막대기 개수
		//boolean razer = false;
		
		for(int i=0;i<len;i++) {
			if(ch[i]=='(') {
				if(ch[i+1]==')') {
					cnt += s.size();
					i++;
				}
				else {
				s.push(ch[i]);
				}
			}
			else {
				s.pop();
				cnt++;
			}
		}
		//System.out.println(cnt);
		//bufferedwriter로 int출력시, string값으로 바꿔줘야함
		bw.write(String.valueOf(cnt));
		bw.close();
	}
}
