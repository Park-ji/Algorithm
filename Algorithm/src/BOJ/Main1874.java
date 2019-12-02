package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;



public class Main1874 {
	public static void main(String[] args) throws IOException {
		Stack<Integer> s = new Stack<Integer>();
		//Scanner scanner = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		List<String> result = new ArrayList<String>();
		//int len = scanner.nextInt();
		int len = Integer.parseInt(bf.readLine());
		int su = 0; // 스택에 넣을 값
		int cp[] = new int[len];
		for (int i = 0; i < len; i++) {
			//cp[i] = scanner.nextInt();
			cp[i] = Integer.parseInt(bf.readLine());
		}

		for (int i = 0; i < len; i++) {
			if (su < cp[i]) {
				while(!(su==cp[i])) {
					su++;
					s.add(su);
					//System.out.println("+");
					result.add("+");
				}
			}
			if(su == cp[i] || s.peek() == cp[i]) {
				s.pop();
				//System.out.println("-");
				result.add("-");
			}
			else if(su > cp[i] || s.peek() != cp[i]) {
				//System.out.println("NO");
				bw.write("NO");
				bw.flush();
				break;
			}
		}
		
		if(s.isEmpty()) {
			for(int i=0;i<result.size();i++) {
				//System.out.println(result.get(i));
				bw.write(result.get(i)+"\n");
				bw.flush();
			}
		}
		
		bf.close();
		bw.close();
		

	}
}
