package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main17299{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> s = new Stack<Integer>();
		int N = Integer.parseInt(bf.readLine());
		int[] num = new int[N];
		int[] neg = new int[N];
		int[] count = new int[1000001];
		//최대값이 1000000이라서 1000000하면 런타임에러
		int[] cnt = new int[N];
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");	
		for(int i=0;i<N;i++) {
			num[i] = Integer.parseInt(st.nextToken());
			count[num[i]]++;
		}
		for(int i=0;i<N;i++) {
			cnt[i] = count[num[i]];
		}
		
		for(int i=0;i<N;i++) {
			if(s.isEmpty())
				s.add(i);
			else {
				if(cnt[s.peek()]<cnt[i]) {
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
		}
		for(int i=0;i<N;i++) {
			bw.write(neg[i]+" ");
		}
		bw.close();
	}
}

//public class Main17299 {
//	static int[] count = new int[1000000];
//	public static void main(String[] args) throws IOException {
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int N = Integer.parseInt(bf.readLine());
//		int[] neg = new int[N];
//		int[] cnt = new int[N];
//		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");	
//		for(int i=0;i<N;i++) {
//			neg[i] = Integer.parseInt(st.nextToken());
//			count[neg[i]]++;
//		}
//		for(int i=0;i<N;i++) {
//			cnt[i] = count[neg[i]];
//			System.out.print(cnt[i]+" ");
//		}
//		System.out.println();
//		
//		for(int i=0;i<N;i++) {
//			for(int j=i+1;j<N;j++) {
//				if(cnt[i]<cnt[j]) { 
//					bw.write(String.valueOf(neg[j]));
//					bw.write(" ");
//					break;
//				}
//				if((j==N-1)&&(cnt[i]>=cnt[j])) {
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
//}
