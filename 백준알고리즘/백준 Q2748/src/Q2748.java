import java.util.*;

public class Q2748 {

	static long[] arr; // ****�� long Ÿ���̾����**** <- N=90���� �־����� ����!!!

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); // n��° �Ǻ���ġ �� (0��°���� ����)
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
