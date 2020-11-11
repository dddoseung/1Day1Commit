import java.util.*;
import java.io.*;

/*이걸 만약 dfs로 푼다면 경우의 수가 너무너무 많아져 시간초과가 발생할 것임*/

 /*
   F(2,2)이면 'F(1,0)+현재값' or 'F(1,1)+현재값'인데, 이미 그 전까지 더한 값이어야 하고 둘 중 최솟값 선택

		F(2,2)= Math.min(F(1,0),F(1,1))+cost(2,2)
		F(1,0)=Math.min(F(0,1),F(0,2))+cost(1,0)
		F(0,1)=이미 저장되어 있음
	*/

public class Q1149 {
	static int N; // 집의 수
	static Integer[][] dp; //메모이제이션 (*Integer로 선언 시, 초기값은 null)
	static int[][] cost; // RGB cost


	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		cost=new int[N][3]; // 3 is R,G,B
		dp=new Integer[N][3];
		
		StringTokenizer st;
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<3;j++) {
				cost[i][j]=Integer.parseInt(st.nextToken());
			
			}
		}		
		dp[0][0]=cost[0][0];
		dp[0][1]=cost[0][1];
		dp[0][2]=cost[0][2];
		
		System.out.println(Math.min(memoization(N- 1, 0), Math.min(memoization(N - 1, 1), memoization(N - 1, 2))));
		
	}
	
	public static int memoization(int x, int y) { // 점화식을 생각해서 구현하는 거
		
		if(x>0&&dp[x][y]==null){
			if(y==2) {
				dp[x][y]=Math.min(memoization(x-1,0), memoization(x-1,1))+cost[x][y];
				return dp[x][y];
				}
			else if(y==1) {
				dp[x][y]=Math.min(memoization(x-1,0), memoization(x-1,2))+cost[x][y];
				return dp[x][y];
			}
			else {
				dp[x][y]=Math.min(memoization(x-1,1), memoization(x-1,2))+cost[x][y];
				return dp[x][y];
			}
		}
		return dp[x][y];
	
		
	}

}
