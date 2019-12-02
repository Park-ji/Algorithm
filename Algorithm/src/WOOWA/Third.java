package WOOWA;

import java.util.Scanner;

//대문자 65~90 => 합 : 65+90 = 155
//소문자 97~122 => 합 : 97+122 = 219

public class Third {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		char[] result = new char[word.length()];
		for(int i=0;i<word.length();i++) {
			char cp = word.charAt(i);
			if(cp>='a'&&cp<='z') result[i] = (char)(219-(int)cp);
			else if(cp>='A'&&cp<='Z') result[i] = (char)(155-(int)cp);
			else result[i]=cp;
			System.out.print(result[i]);
		}
	}	
}

//public static void main(String[] args) {
//Scanner sc = new Scanner(System.in);
//String word = sc.nextLine();
//char[] result = new char[word.length()];
//for(int i=0;i<word.length();i++) {
//	char cp = word.charAt(i);
//	if(option(cp)) result[i] = transfer(cp);
//	else result[i] = cp;
//}
//for(int i=0;i<result.length;i++) {
//	System.out.print(result[i]);
//}
//}
//public static boolean option(char c) {
//boolean flag = false;
//if(c>='a'&&c<='z') flag = true;
//else if(c>='A'&&c<='Z') flag = true;
//return flag;
//}
//public static char transfer(char c) {
//int ch = c;
//if(c>='a'&&c<='z') ch = 219-ch;
//else if(c>='A'&&c<='Z') ch = 155-ch;
//return (char)ch;
//}

