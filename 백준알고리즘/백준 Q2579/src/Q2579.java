import java.io.*;

/*���� - / 0 1 2 3 4 5 (����� ����=6)

(1)
��� ��ܿ��� 
f(n)-2 // 2��� �ѹ��� ������
f(n)-1 // �̷����� ������ ����(�� ���� �� ����� ���������� �ȵ�)

(2)
������-1 ����� ��ų� or ������-2 ����� ��ų�

*****������ ���� ���ݱ��� �� �ִ밪�� ��*****
*/

public class Q2579 {

	static int N; // ����� ����
	static int[] stair; // ��� ���� ���� �迭
	static int[] dp; // �޸������̼� �迭
	static int[] what_stair; // ��� ���� ��ŭ�� ������


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		stair = new int[N];
		dp=new int[N]; // �湮�� ǥ���� �迭
		what_stair=new int[N];
		
		for (int i = 0; i < N; i++) {
			stair[i] = Integer.parseInt(br.readLine());
			dp[i]=-1; // �湮 �� �� �� -1�� �ʱ�ȭ
		}
		
		dp[N-1]=stair[N-1];
		
		memoization(N-2);
		memoization(N-3);
		// ������ ��ܿ��� �����ؼ� ù��° ��ܱ���  ex) N=6�� �� dfs(4) or dfs(3)

	}
	public static int memoization(int num) {
		if(num==N-2)
			
		if(dp[num]==-1) { // �湮�� ���� ���ٸ� 
			
			if(what_stair[num+1]!=1) { // ���� ���� 1��� ������ �ƴ϶��
				if(memoization(num-1)>memoization(num-2)) {
					what_stair[num]=1;
					dp[num]=
				}
				dp[num]=Math.max(memoization(num-1), memoization(num-2))+stair[num];
			}
			else {
				what_stair[num]=2;
				dp[num]=memoization(num-2)+stair[num];
			}
		}
		return dp[num]; // �湮�� ���� �ִٸ� (���ȣ��� �̹� �ִ밪�� ã�� ���¶��)
	}

}