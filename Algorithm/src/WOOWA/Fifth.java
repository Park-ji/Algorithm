package WOOWA;

import java.util.Scanner;

public class Fifth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		
		for(int i=0;i<num;i++) {
			String str = String.valueOf(i+1);
			for(int j=0;j<str.length();j++) {
				char c = str.charAt(j);
				if(c=='3'||c=='6'||c=='9') cnt++;
			}
		}
		System.out.println(cnt);
	}

}
