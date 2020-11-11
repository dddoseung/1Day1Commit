import java.io.*;
									/* dp로 풀기*/
public class Q1003_a2 {
	
	static Integer[][] dp=new Integer[41][2]; // Integer 형-> NULL 체크를 위해서!
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		/*초기값*/
		dp[0][0]=1; // N=0일 때 fibo(0) 호출 횟수
		dp[0][1]=0; // N=0일 때 fibo(1) 호출 횟수
		dp[1][0]=0; // N=1일 때 fibo(0) 호출 횟수
		dp[1][1]=1; // N=1일 때 fibo(1) 호출 횟수
		
		for(int i=0;i<T;i++) {
			int N=Integer.parseInt(br.readLine());
			fibo(N);
			
			System.out.println(dp[N][0]+" "+dp[N][1]);
		}
	}
	
	static Integer[] fibo(int N) {
		if(dp[N][0]==null || dp[N][1]==null) { // 값이 저장되어 있지 않을 때
			dp[N][0]=fibo(N-1)[0]+fibo(N-2)[0];
			dp[N][1]=fibo(N-1)[1]+fibo(N-2)[1];
		}
		
		return dp[N]; // 값이 저장되어 있을 때
	}

}
