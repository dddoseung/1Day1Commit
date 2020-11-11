import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
1.재귀함수의 변수를 뭐로 해야할까? -> memoization(int x, int y)
2.dp[][] 배열의 index는? -> dp[x][y]

동적계획법의 특징: dp[][]와 재귀함수의 변수( , )는 같다
*/

public class Q12865 {
	
	static Integer[][] dp; // knapsack 표
	static int[] W; // weight(무게)
	static int[] V; // value(가치)
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken()); // 물품의 수
		int K=Integer.parseInt(st.nextToken()); // 최대 무게
		
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
	public static int knapsack(int i,int k) { // i->row (i+1번째까지 물건을 넣을 수 있을 때) , k->col (k가 최대무게일 때)
		if(i<0||k<0) // 범위 밖이 된다면
			return 0;
		
		if(dp[i][k]==null) { // 탐색하지 않았을 경우
			if(W[i]>k) { // 현재 물건(i)를 담지 못하는 경우
				dp[i][k]=knapsack(i-1,k);
			}
			else {
				dp[i][k]=Math.max(knapsack(i-1,k),knapsack(i-1,k-W[i])+V[i]); 
				// 현재 물건을 넣었고(현재 물건의 가치는 더하고) , 자신을 빼고 난 최대무게 (=k-W[i])일 때와 같은 이윤을 남길 수 있음
			}
		}
		return dp[i][k];
		
	}
}

