import java.io.*;
									/* dp�� Ǯ��*/
public class Q1003_a2 {
	
	static Integer[][] dp=new Integer[41][2]; // Integer ��-> NULL üũ�� ���ؼ�!
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		/*�ʱⰪ*/
		dp[0][0]=1; // N=0�� �� fibo(0) ȣ�� Ƚ��
		dp[0][1]=0; // N=0�� �� fibo(1) ȣ�� Ƚ��
		dp[1][0]=0; // N=1�� �� fibo(0) ȣ�� Ƚ��
		dp[1][1]=1; // N=1�� �� fibo(1) ȣ�� Ƚ��
		
		for(int i=0;i<T;i++) {
			int N=Integer.parseInt(br.readLine());
			fibo(N);
			
			System.out.println(dp[N][0]+" "+dp[N][1]);
		}
	}
	
	static Integer[] fibo(int N) {
		if(dp[N][0]==null || dp[N][1]==null) { // ���� ����Ǿ� ���� ���� ��
			dp[N][0]=fibo(N-1)[0]+fibo(N-2)[0];
			dp[N][1]=fibo(N-1)[1]+fibo(N-2)[1];
		}
		
		return dp[N]; // ���� ����Ǿ� ���� ��
	}

}
