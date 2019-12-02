package BOJ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Josephus {
	public static void main(String[] args) {
		Queue<Integer> js = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int num, target;
		System.out.print("총 몇명? ");
		num = sc.nextInt();
		System.out.print("몇번째 제거? ");
		
		target = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			js.add(i+1);
		}
		for(int i=0;i<target-1;i++) {
			js.add(js.poll());
		}
		js.remove();
		for(int i=0;i<num-target;i++) {
			js.add(js.poll());
		}
		System.out.println(js);
		
	}

}
