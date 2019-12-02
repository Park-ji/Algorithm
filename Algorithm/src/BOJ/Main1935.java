package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main1935{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> s = new Stack<Character>();
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();
		char[] c = str.toCharArray();
		//int cap[] = new int[27]; //A:65
		int value[] = new int[num];
		for(int i=0;i<num;i++) {
			value[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0;i<c.length;i++) {
			if(c[i]>='A'&&c[i]<='Z') {
				
			}
		}
		
		
	}
}

/*
 * public class Main1935 { static double cal(double num1 , double num2, char op)
 * { double res =0; switch(op) { case '*': res = num1*num2; break; case '/': res
 * = num1/num2; break; case '+': res = num1+num2; break; case '-': res =
 * num1-num2; break; } return res; } public static void main(String[] args)
 * throws IOException { BufferedReader br = new BufferedReader(new
 * InputStreamReader(System.in)); BufferedWriter bw = new BufferedWriter(new
 * OutputStreamWriter(System.out)); Stack<Double> s = new Stack<Double>(); int
 * num = Integer.parseInt(br.readLine()); String str = br.readLine(); char[] var
 * = str.toCharArray(); int[] value = new int[num]; double result ;
 * 
 * for(int i=0;i<num;i++) { value[i]=Integer.parseInt(br.readLine()); } //
 * System.out.println(Integer.parseInt(br.readLine())); //A : 65 , a : 97 int
 * cap = 65; //System.out.println((char)cap); int idx = 0; //valueÀÇ index°ª int
 * len = var.length; for(int i=0;i<len;i++) { if(var[i]==(char)cap) { var[i] =
 * String.valueOf(value[idx]).charAt(0); idx++; cap++; } }
 * 
 * for(int i=0;i<len;i++) { if(var[i]=='*' || var[i]=='+' ||
 * var[i]=='/'||var[i]=='-') { double num1 = s.pop(); double num2 = s.pop();
 * result = cal(num2, num1, var[i]); s.add(result); }
 * 
 * else { s.add(Double.parseDouble(String.valueOf(var[i]))); } }
 * 
 * System.out.println(s.pop());
 * 
 * } }
 * 
 * 
 */










