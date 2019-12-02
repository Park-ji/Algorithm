package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main1406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> left = new Stack<Character>();
		Stack<Character> right = new Stack<Character>();
		

		String str = br.readLine();
		int len = str.length();
		for (int i = 0; i < len; i++) {
			left.push(str.charAt(i));
		}

		int num = Integer.parseInt(br.readLine());
		while (num-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String cmd = st.nextToken();
			
			if(cmd.equals("L")) {
				if(!left.isEmpty())
					right.add(left.pop());
			}
			else if(cmd.equals("D")) {
				if(!right.isEmpty())
					left.add(right.pop());
			}
			else if(cmd.equals("B")) {
				if(!left.isEmpty())
					left.pop();
			}
			else if(cmd.equals("P")) {
				String value = st.nextToken();
				char c = value.charAt(0);
				left.push(c);
			}

		}
		
		while(!left.isEmpty()) {
			right.add(left.pop());
		}
		while(!right.isEmpty()) 
			bw.write(right.pop());
		bw.close();
	}

}
