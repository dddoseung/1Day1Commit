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

ex) 2,1은 3,1 or 3,2에서만 받을 수 있음
      0,0은 1,0 or 1,1에서만 //*즉, 아래에서 위 방향으로 재귀호출 ( 이 방향이 훨씬 코드가 간결함)

n,m는   n+1,m or n+1,m+1에서만 받음
이 때, n+1,m or n+1,m+1은 이미 최대값이어야 하고 메모이제이션
*/

public class Q1932_2 {

	static int n;
	static int[][] triangle; // 입력받은 삼각형 배열
	static int[][] dp; // 메모이제이션 배열(방문을 표시할 배열)
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
		
		for(int i=0;i<n;i++) {
			dp[n-1][i]=triangle[n-1][i]; // 맨 마지막 행의 값을 dp에 넣었음
		}
		
		System.out.println(memoization(0,0));
		
		
	}
	public static int memoization(int row, int col) {
		if(dp[row][col]==-1&&row<n-1) { // 아직 값이 들어간 적이 없었다면
			dp[row][col]=Math.max(memoization(row+1,col),memoization(row+1,col+1))+triangle[row][col];
		}
		return dp[row][col];
	}

}
