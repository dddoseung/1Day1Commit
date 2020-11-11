import java.util.*;
import java.io.*;

/*�̰� ���� dfs�� Ǭ�ٸ� ����� ���� �ʹ��ʹ� ������ �ð��ʰ��� �߻��� ����*/

 /*
   F(2,2)�̸� 'F(1,0)+���簪' or 'F(1,1)+���簪'�ε�, �̹� �� ������ ���� ���̾�� �ϰ� �� �� �ּڰ� ����

		F(2,2)= Math.min(F(1,0),F(1,1))+cost(2,2)
		F(1,0)=Math.min(F(0,1),F(0,2))+cost(1,0)
		F(0,1)=�̹� ����Ǿ� ����
	*/

public class Q1149 {
	static int N; // ���� ��
	static Integer[][] dp; //�޸������̼� (*Integer�� ���� ��, �ʱⰪ�� null)
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
	
	public static int memoization(int x, int y) { // ��ȭ���� �����ؼ� �����ϴ� ��
		
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
