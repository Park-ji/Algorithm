package WOOWA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//5만원권
//1만원권
//5천원권
//1천원권
//오백원동전
//백원동전
//오십원동전
//십원동전
//일원동전
//금액이 큰 순서대로 배열에 담아 return 하도록 solution 메서드
//50237 [1,0,0,0,0,2,0,3,7]

public class First {
	
	public static List<Integer> solution(int m) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> answer = new ArrayList<Integer>();
		list.add(50000);
		list.add(10000);
		list.add(5000);
		list.add(1000);
		list.add(500);
		list.add(100);
		list.add(10);
		list.add(1);
		for(int i=0;i<list.size();i++) {
			answer.add(m/list.get(i));
			m%=list.get(i);
		}
		return answer;
			
//	int[] money = new int []{50000,10000,5000,1000,500,100,10,1};
//	int[] answer = new int[money.length];
//	for(int i=0;i<money.length;i++) {	
//		answer[i] = m/money[i];
//		m %= money[i];
//	}
//	return answer;
	}
		
	public static void main(String[] args) {
		int m;
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		List<Integer>result = new ArrayList<Integer>();
		result = solution(m);
		System.out.println(result);
		
	}
	
	
	
}
