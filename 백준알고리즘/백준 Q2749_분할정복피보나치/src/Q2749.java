import java.io.*;

// 이 문제는 일반적인 피보나치+메모이제이션으로도 런타임이 초과된다.
//그러므로 "피사노 주기"란 것을 이용해야 함.

//피보나치 수를 나눌 수를 K=10^n이라고 할 때, 피사노 주기는 15*10^(n-1)이다.
//즉, k가 10의 6제곱인 1,000,000이면, 피사노 주기는 1,500,000이다.
//1,500,000번째 까지의 피보나치 수를 K로 나눈 나머지 값들을 구하면 
//그 이후의 수는 계산할 필요가 없다는 소리이다.


public class Q2749 {
	static long[] arr; // 피보나치 수를 담을 배열
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	       long n = Long.parseLong(reader.readLine());
	        // 1 <= n <= 1,000,000,000,000,000,000

		int pisano=1500000; // 문제에서 K는 K=10^6이므로!

		while(n>pisano) {
			n%=pisano;
		}
		
		arr=new long[(int) (n+1)];
		
		arr[0]=0;
		arr[1]=1;
		
		for(int i=2;i<=n;i++) {
				arr[i]=(arr[i-1]+arr[i-2])%1000000;
			}

	System.out.print(arr[(int)n]);
	}
	
}
