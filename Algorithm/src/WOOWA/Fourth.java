package WOOWA;

public class Fourth {
	public static void main(String[] args) {
		int[] pobi = {99,102};
		int[] crong = {211,212};
		System.out.println(solution(pobi,crong));
//		int pm=0,cm=0;
//		int result = 0;
//		
//		if(pobi[1]-pobi[0]!=1) result = -1;
//		if(crong[1]-crong[0]!=1) result = -1;
//		
//		if(result !=-1) {
//			for(int i=0;i<pobi.length;i++) {
//				if(score(pobi[i])>pm) pm = score(pobi[i]);
//				if(score(crong[i])>cm) cm = score(crong[i]);
//			}
//			result = (pm==cm)? 0:((pm>cm)?1:2);
//		}
//		System.out.println(result);
	}
	
	public static int solution(int[] pobi, int[] crong) {
		int pm = 0, cm = 0;
		int result = 0;
		
		if(pobi[0]-pobi[1] == -1) result = -1;
		if(crong[0]-crong[1]==-1) result = -1;
		
		if(result !=-1) {
			for(int i=0;i<pobi.length;i++) {
				if(score(pobi[i])>pm) pm = score(pobi[i]);
				if(score(crong[i])>cm) cm = score(crong[i]);
			}
			result = (pm==cm)? 0:((pm>cm)?1:2);
		}
		return result;
	}
	
	public static int score(int num) {
		int n = num;
		  
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		
		int sum =0;
		int mul =1;

		n1 = n/100;
		n%=100;
		n2 = n/10;
		n%=10;
		n3 = n;
		
		sum = n1+n2+n3;
		
		if(n1==0&&n2==0) mul = n3;
		else if(n1==0) mul = n2*n3;
		else mul = n1*n2*n3;
				
		int result = (sum>mul)?sum:mul;
		return result;
	}
}

//1~400 ������
//���� : Ȧ��
//������ : ¦��
//��� ������ => ��ȣ

//1. å�� ���Ƿ� ��
//2. ���� : �� �ڸ� ���ڸ� ��� ���ϰų�, ��� ���� ���� ū���� ����
//3. ������ : �� �ڸ� ���ڸ� ��� ���ϰų�, ��� ���� ���� ū���� ����
//4. 2~3�������� ���� ū ���� ������ ������ ����
//5. ������ ���� ���� ���� ����� ������ ����
//6. ���� ���̳� ������ ���� �������� å�� ��ġġ x
//7. ��ģ �������� ����ִ� �迭 : pobi, crong
//8. ���� �̱�� : 1/ ũ���� �̱�� : 2/ ���º� : 0/ ���ܻ��� : -1
//���
//pobi[97,98]
//cron[197,198]
//result : 0
//���ܻ��� : ����, ������ // ���ڴ� ������ // 1~400������ ���̿�����