package WOOWA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//5������
//1������
//5õ����
//1õ����
//���������
//�������
//���ʿ�����
//�ʿ�����
//�Ͽ�����
//�ݾ��� ū ������� �迭�� ��� return �ϵ��� solution �޼���
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
