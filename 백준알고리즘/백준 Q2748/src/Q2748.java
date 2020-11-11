import java.util.*;

public class Q2748 {

	static long[] arr; // ****꼭 long 타입이어야함**** <- N=90까지 주어지기 때문!!!

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); // n번째 피보나치 수 (0번째부터 시작)
		arr=new long[n+1]; 
		
		System.out.println(fibo(n));
	}

	public static long fibo(int n) {
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else {
			if(arr[n]!=0)
				return arr[n];
			else {
				arr[n]=fibo(n-1)+fibo(n-2);
				return arr[n];
			}
		}
	}
}
