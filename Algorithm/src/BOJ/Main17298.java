package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main17298 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> s = new Stack<Integer>();
		int N = Integer.parseInt(bf.readLine());
		int[] num = new int[N];
		int[] neg = new int[N];
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");	
		for(int i=0;i<N;i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<N;i++) {
			if(s.isEmpty())
				s.add(i);
			else {
				if(num[s.peek()]<num[i]) {
					neg[s.peek()] = num[i];
					s.pop();
					i--;
				}
				else {
					s.add(i);
				}
			}
		}
		while(!s.isEmpty()) {
			neg[s.pop()] = -1;
//			neg[s.peek()] = -1;
//			s.pop();
//			
//			if(num[s.peek()]<num[N-1]) {
//				neg[s.peek()] = num[N-1];
//				s.pop();
//			}
//			else {
//				neg[s.peek()] = -1;
//				s.pop();
//			}
		}
//		neg[N-1] = -1;
		
		for(int i=0;i<N;i++) {
			bw.write(neg[i]+" ");
		}
		bw.close();
		
	}
	//시간초과
//	public static void main(String[] args) throws IOException {
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int N = Integer.parseInt(bf.readLine());
//		int[] neg = new int[N];
//		
//		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");	
//		for(int i=0;i<N;i++) {
//			neg[i] = Integer.parseInt(st.nextToken());
//		}
//		for(int i=0;i<N;i++) {
//			for(int j=i+1;j<N;j++) {
//				if(neg[i]<neg[j]) { 
//					bw.write(String.valueOf(neg[j]));
//					bw.write(" ");
//					break;
//				}
//				if((j==N-1)&&(neg[i]>=neg[j])) {
//					bw.write(String.valueOf(-1));
//					bw.write(" ");
//				}
//				
//			}
//		}
//		bw.write(String.valueOf(-1));
//		
//		bw.close();
//	}
}
