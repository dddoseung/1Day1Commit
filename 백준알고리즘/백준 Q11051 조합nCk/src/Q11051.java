import java.util.Scanner;

//파스칼의 삼각형 원리 = 조합 nCk

public class Q11051{
	static int N;
	static int K;
	static int dp[][];
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		K=sc.nextInt();
		dp=new int[N+1][N+1];
		   // N=3일 때 dp[3][0]=3C0, dp[3][1]=3C1,dp[3][2]=3C2,dp[3][3]=3C3
		
		System.out.println(pascal(N,K));
	}
	
	// nCk = n-1Ck-1 + n-1Ck
	public static int pascal(int n, int k) {
		if(n==k || k==0) {
			return 1;
		}
		if(dp[n][k]==0) {
			dp[n][k]=pascal(n-1,k-1)+pascal(n-1,k);
		}
		
		return dp[n][k]%10007;
	}
}