import java.io.*;

/*  �ĵ��� ����  */
public class Q9461 {

	static int N;
	static int[] P; // ��°
	static long[] dp = new long[101]; // 1���� �����սô�
	// (************100�� ��� ���� ���ϱ޼������� Ŀ���Ƿ� long��***************)

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		P = new int[N];
		for (int i = 0; i < N; i++) {
			P[i] = Integer.parseInt(br.readLine());
		}

		/* �ʱⰪ (���� ����) */
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
