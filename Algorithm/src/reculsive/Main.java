package reculsive;

import java.io.IOException;
import java.util.Scanner;

public class Main{
    public int[] m=new int[100000];
     
    public static void main(String[] args) throws IOException{
        Main sample=new Main();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        
        for(int i=0;i<100000;i++){
               //배열의 원소값을 전부 0으로 초기화
               //초기화 하지 않으면 nullPointException이 발생한다.
         sample.m[i]=0;
        }
        int fib=sample.Fibonachi(n);
         
        System.out.println(fib);
    }
//  피보나치 수열을 응용한 함수, 계단 오르는 방법의 수를 리턴한다.
    public int Fibonachi(int n){
//  1,2,3 번째 항은 미리 초기화 해 두었다.
//     m[0]=1; m[1]=2; m[2]=4;
    	m[0] = 0; 
//여기서 배열에 재귀호출 한 값을 대입하게 되면 n이 커질때 StackOverFlow가
//발생한다. 
// return m[i]=Fibonachi(n-1)+Fibonachi(n-2)+Fibonachi(n-3);
//그러므로 아예 배열로 푸는것이 좋다. (재귀호출을 추천하지 않는다.)
//     for(int i=3;i<n;i++){
//      m[i]=(m[i-1]+m[i-2]+m[i-3])%1000;
//     }
     for(int i=2;i<n;i++){
         m[i]=(m[i-1]+m[i-2])%1000;
        }
     return m[n-1];
    }
}