import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*LIS
 * 
 * �� ���ڴ� �ڱ� ������ ���� �� �̹� LIS�� ����� ���¿��� �� -> dp���

 * */
public class Q11053 {
	static int N;
	static int[] arr;
	static int[] dp;
	static int[] visit;
	static int max=1; 
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		arr=new int[N+1]; // 1���� ����
		dp=new int[N+1]; // 1���� ����
		visit=new int[N+1]; // dp�� �湮ǥ��
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			dp[i]=1; // 1�� �ʱ�ȭ
			visit[i]=-1;
		}

		for(int i=1;i<=N;i++) { // ������ ���°�� ���� �� �� �𸣱� ������ �� �۾�����
			max=Math.max(LIS(i), max);
		}
		System.out.println(max);
	}
	public static int LIS(int index) { // ������ ù��° ���Һ��� Ž���ؼ� ���� ū ���� ����ϰ� �ִٰ� �� ���ں��� ū �ָ� ������ ������Ŵ
		if(visit[index]==-1) { // �湮�� �� ���� ���� ��
			visit[index]=1; // �湮ǥ�ø� ���ְ�
			
			for(int n=1;n<index;n++) {
			//for(int n=index-1;n>=1;n--) {
					if(arr[n]<arr[index]) {
						dp[index]=Math.max(LIS(n)+1,dp[index]); // ������ ���鼭 ���� ū ��+1�� dp�� �����ϰ� ���ȣ���ϸ� ��
					}
			}
		}
		//�̹� LIS �Լ��� �湮�ߴٸ� �ٷ� ����
		return dp[index];
	}
}
