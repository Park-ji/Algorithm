package BOJ;

import java.util.Scanner;
import java.util.Stack;

public class Main9093 {
	public static void main(String[] args) {
		Stack<Character> s = new Stack<Character>();
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		for(int i=0;i<sentence.length();i++) {
			s.push(sentence.charAt(i));
		}
		
		while(!s.isEmpty())
		 System.out.print(s.pop());
		
	}

}
