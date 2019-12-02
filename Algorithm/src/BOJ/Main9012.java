package BOJ;

import java.util.Scanner;
import java.util.Stack;

public class Main9012 {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		Scanner scanner = new Scanner(System.in);
		int tc = scanner.nextInt();
		String tmp = scanner.nextLine();
		
		while(tc-- > 0) {
		String str = scanner.nextLine();
		String[] c = str.split("");
		for (int i = 0; i < c.length; i++) {
			if(c[i].equals("(")) {
				s.push(c[i]);
			}
			else {
				if(s.isEmpty()) {
					s.push(c[i]);
					break;
				}
				else {
					s.pop();
				}
			}
			
		}
		if(s.isEmpty()) System.out.println("YES");
		else System.out.println("NO");
		}
		
		s.clear();
	}

}
