import java.io.*;

/*  파도반 수열  */
public class Q9461 {

	static int N;
	static int[] P; // 번째
	static long[] dp = new long[101]; // 1부터 시작합시다
	// (************100의 경우 값이 기하급수적으로 커지므로 long형***************)

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		P = new int[N];
		for (int i = 0; i < N; i++) {
			P[i] = Integer.parseInt(br.readLine());
		}

		/* 초기값 (변의 길이) */
		dp[1] = 1;
		dp[2] = dp[1];
		dp[3] = dp[2];

		for (int i = 0; i < N; i++) {
			System.out.println(func(P[i]));
		}

	}

	static long func(int n) {
		if (dp[n] == 0) {
			dp[n] = func(n - 2) + func(n - 3);
			return dp[n];
		} else
			return dp[n];

	}
}
