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
               //�迭�� ���Ұ��� ���� 0���� �ʱ�ȭ
               //�ʱ�ȭ ���� ������ nullPointException�� �߻��Ѵ�.
         sample.m[i]=0;
        }
        int fib=sample.Fibonachi(n);
         
        System.out.println(fib);
    }
//  �Ǻ���ġ ������ ������ �Լ�, ��� ������ ����� ���� �����Ѵ�.
    public int Fibonachi(int n){
//  1,2,3 ��° ���� �̸� �ʱ�ȭ �� �ξ���.
//     m[0]=1; m[1]=2; m[2]=4;
    	m[0] = 0; 
//���⼭ �迭�� ���ȣ�� �� ���� �����ϰ� �Ǹ� n�� Ŀ���� StackOverFlow��
//�߻��Ѵ�. 
// return m[i]=Fibonachi(n-1)+Fibonachi(n-2)+Fibonachi(n-3);
//�׷��Ƿ� �ƿ� �迭�� Ǫ�°��� ����. (���ȣ���� ��õ���� �ʴ´�.)
//     for(int i=3;i<n;i++){
//      m[i]=(m[i-1]+m[i-2]+m[i-3])%1000;
//     }
     for(int i=2;i<n;i++){
         m[i]=(m[i-1]+m[i-2])%1000;
        }
     return m[n-1];
    }
}