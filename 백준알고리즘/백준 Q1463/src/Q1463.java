import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
 * �ʱ� ����: 
 3�� ����̸� 3���� ������(1������) 
2�� ����̸� -1�� ���� �� 3�� ����� �Ǹ� 3���� ����(1�� ����)
2�� ����̸� -1�� ���� �� 3�� ����� �ȵǸ� -1�� ���ϰ� 2�� �ٷ� ����
2�� ����� �ƴϰ� 3�� ����� �ƴϸ� 1�� ��(3�� ����)
     ��, ������ ������ ���Ͽ���
*/
/*----------------------------------------------------*/
/*
 * �´� Ǯ��:
 * ��� ���� ���ؼ� �� ���� ���� ������ �������� �� ���� (���ڸ��� �� �ٸ���)
 * ��, ���ȣ������ �̿��Ͽ� �� ������ ���ȣ���� �ּڰ��� Math.min���� �����ϸ� ��
 * �� ���� ����� �� ���� ������ Math.min �̿�
 */


 
public class Q1463 {
 
	static int N; // 1<=N<=10^6
	static int[] dp; // ������ �ּڰ��� ���� �迭  (����: N�� �� dp[N-1]�� �����)
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine()); // ���� N�Է�
		dp=new int[N];
		
		for(int i=0;i<dp.length;i++) {
			//�̷��� ���ִ� ����: N<=2�� ���� dp size�� N�̹Ƿ�, �ʱⰪ ������ dp[N-1]������ ����� ��
			if(i==0) 
				dp[0]=0;
			else if(i==1)
				dp[1]=1;
			else if(i==2)
				dp[2]=1;
			else
				dp[i]=-1; // -1�� �ʱ�ȭ
		}
		
		
		System.out.println(memoization(N));
	}

	public static int memoization(int N) { // ���ȣ��

		if(dp[N-1]==-1) { // ���� �ȵǾ�������
			if(N%2==0 && N%3==0) { // 2�ε� �������� 3���ε� �������ٸ�
				dp[N-1]=Math.min(Math.min(memoization(N/2), memoization(N/3)),memoization(N-1))+1;
			}
			else if(N%2==0 && N%3!=0) { // 3���� �� ��������
				dp[N-1]=Math.min(memoization(N/2),memoization(N-1))+1;
			}
			else if(N%2!=0 && N%3==0) { // 2�� �� ��������
				dp[N-1]=Math.min(memoization(N/3), memoization(N-1))+1;
			}
			else { // 2�ε� �ȳ������� 3���ε� �ȳ�������
				dp[N-1]=memoization(N-1)+1;
			}
		}
		return dp[N-1];
	}
}
