import java.io.*;
import java.util.*;

/*
			 0,0
          1,0 1,1
      2,0 2,1 2,2
   3,0 3,1 3,2 3,3
4,0 4,1 4,2 4,3 4,4 <- 2���� �迭�� ����� (�ڷ����� int / �Է� �� �޾����� -1)
....
n-1,0 n-1,1 .... n-1,n-1

ex) 4,1�� 3,0 3,2������ ���� �� ����
      4,0�� 3,0������  // *��, ������ �Ʒ� �������� ���ȣ��

n,m��   n-1,m-1 or n-1,m������ ����
�� ��, n-1,m-1 or n-1,m�� �̹� �ִ밪�̾�� �ϰ� �޸������̼�
*/

public class Q1932 {

	static int n;
	static int[][] triangle; // �Է¹��� �ﰢ�� �迭
	static int[][] dp; // �޸������̼� �迭
	static int max; 
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		n=Integer.parseInt(br.readLine()); // �ﰢ���� ũ��
		triangle=new int[n][n];
		dp=new int[n][n];
		
		for(int i=0;i<n;i++) { // ��
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int j=0;j<n;j++) { // ��
				dp[i][j]=-1; // -1�� �ʱ�ȭ
				if(st.hasMoreTokens()==true) { // Token�� ������
					triangle[i][j]=Integer.parseInt(st.nextToken());
				}
				else { // ������
					triangle[i][j]=-1; // -1�� ����
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
