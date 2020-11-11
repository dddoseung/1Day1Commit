import java.io.*;
import java.util.*;

/*
			 0,0
          1,0 1,1
      2,0 2,1 2,2
   3,0 3,1 3,2 3,3
4,0 4,1 4,2 4,3 4,4 <- 2차원 배열로 만들기 (자료형은 int / 입력 못 받았으면 -1)
....
n-1,0 n-1,1 .... n-1,n-1

ex) 4,1은 3,0 3,2에서만 받을 수 있음
      4,0은 3,0에서만  // *즉, 위에서 아래 방향으로 재귀호출

n,m는   n-1,m-1 or n-1,m에서만 받음
이 때, n-1,m-1 or n-1,m은 이미 최대값이어야 하고 메모이제이션
*/

public class Q1932 {

	static int n;
	static int[][] triangle; // 입력받은 삼각형 배열
	static int[][] dp; // 메모이제이션 배열
	static int max; 
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		n=Integer.parseInt(br.readLine()); // 삼각형의 크기
		triangle=new int[n][n];
		dp=new int[n][n];
		
		for(int i=0;i<n;i++) { // 행
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int j=0;j<n;j++) { // 열
				dp[i][j]=-1; // -1로 초기화
				if(st.hasMoreTokens()==true) { // Token이 있으면
					triangle[i][j]=Integer.parseInt(st.nextToken());
				}
				else { // 없으면
					triangle[i][j]=-1; // -1을 넣음
				}
			}
		}
		
		dp[0][0]=triangle[0][0];
		
		if(n==1) {
			max=memoization(n-1,0);
		}
		else {
			max=memoization(n-1,0);
			for(int i=0;i<n-1;i++) { // n=5
				max=Math.max(max, memoization(n-1,i+1));
			}
		}
		
		System.out.println(max);
	}
	public static int memoization(int row, int col) {
		if(dp[row][col]==-1&&row>0) {
			if(col==0) {
				dp[row][col]=memoization(row-1,0)+triangle[row][col];
//
			}
			else if(col==row) {
				dp[row][col]=memoization(row-1,col-1)+triangle[row][col];

			}
			else {
				dp[row][col]=Math.max(memoization(row-1,col-1), memoization(row-1,col))+triangle[row][col];

			}
		}
		return dp[row][col];
	}

}
