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

//1~400 페이지
//왼쪽 : 홀수
//오른쪽 : 짝수
//모든 페이지 => 번호

//1. 책을 임의로 핌
//2. 왼쪽 : 각 자리 숫자를 모두 더하거나, 모두 곱해 가장 큰수를 구함
//3. 오른쪽 : 각 자리 숫자를 모두 더하거나, 모두 곱해 가장 큰수를 구함
//4. 2~3과정에서 가장 큰 수를 본인의 점수로 정함
//5. 점수를 비교해 가장 높은 사람이 게임의 승자
//6. 시작 면이나 마지막 면이 나오도록 책을 펼치치 x
//7. 펼친 페이지가 들어있는 배열 : pobi, crong
//8. 포비가 이기면 : 1/ 크롱이 이기면 : 2/ 무승부 : 0/ 예외사항 : -1
//결과
//pobi[97,98]
//cron[197,198]
//result : 0
//예외사항 : 왼쪽, 오른쪽 // 숫자는 연속임 // 1~400페이지 사이여야함