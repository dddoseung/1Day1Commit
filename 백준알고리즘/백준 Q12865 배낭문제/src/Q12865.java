import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
1.����Լ��� ������ ���� �ؾ��ұ�? -> memoization(int x, int y)
2.dp[][] �迭�� index��? -> dp[x][y]

������ȹ���� Ư¡: dp[][]�� ����Լ��� ����( , )�� ����
*/

public class Q12865 {
	
	static Integer[][] dp; // knapsack ǥ
	static int[] W; // weight(����)
	static int[] V; // value(��ġ)
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken()); // ��ǰ�� ��
		int K=Integer.parseInt(st.nextToken()); // �ִ� ����
		
		W=new int[N];
		V=new int[N];
		
		dp=new Integer[N][K+1];
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			W[i]=Integer.parseInt(st.nextToken());
			V[i]=Integer.parseInt(st.nextToken());
		}
		
		System.out.println(knapsack(N-1,K));
		
	}
	public static int knapsack(int i,int k) { // i->row (i+1��°���� ������ ���� �� ���� ��) , k->col (k�� �ִ빫���� ��)
		if(i<0||k<0) // ���� ���� �ȴٸ�
			return 0;
		
		if(dp[i][k]==null) { // Ž������ �ʾ��� ���
			if(W[i]>k) { // ���� ����(i)�� ���� ���ϴ� ���
				dp[i][k]=knapsack(i-1,k);
			}
			else {
				dp[i][k]=Math.max(knapsack(i-1,k),knapsack(i-1,k-W[i])+V[i]); 
				// ���� ������ �־���(���� ������ ��ġ�� ���ϰ�) , �ڽ��� ���� �� �ִ빫�� (=k-W[i])�� ���� ���� ������ ���� �� ����
			}
		}
		return dp[i][k];
		
	}
}

