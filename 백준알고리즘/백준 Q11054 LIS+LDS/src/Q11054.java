import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
//LIS+LDS
public class Q11054 {
	static int N; // ������ ũ�� N
	static int[] arr; // ������ ���� �迭
	
	static int[] dp_LIS; // �޸������̼�
	static int[] visit_LIS; // dp�� �湮�ߴ°�(����Ǿ��ִ°�)�� ��� �迭

	static int[] dp_LDS;
	static int[] visit_LDS;
	
	static int max=1;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		arr=new int[N+1]; // 1���� ����
		
		dp_LIS=new int[N+1]; // 1���� ����
		visit_LIS=new int[N+1]; // dp�� �湮ǥ��
		
		dp_LDS=new int[N+1]; // 1���� ����
		visit_LDS=new int[N+1]; // dp�� �湮ǥ��
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			
			dp_LIS[i]=1; // 1�� �ʱ�ȭ
			visit_LIS[i]=-1;
			
			dp_LDS[i]=1;
			visit_LDS[i]=-1;
		}
		
		for(int i=1;i<=N;i++) {
			max=Math.max(LIS(i)+LDS(i)-1, max);
		}
		System.out.println(max);
		
	}
	
	/*���� ���� �κм���*/
	public static int LIS(int num) { // num�� index��
		if(visit_LIS[num]==-1) {
			visit_LIS[num]=1; //
			
			for(int i=1;i<num;i++) { // arr[num]�� �� ����
				if(arr[i]<arr[num])
					dp_LIS[num]=Math.max(LIS(i)+1, dp_LIS[num]);
			}
		}
		return dp_LIS[num];
	}
	
	/*���� ���� �κм���*/
	public static int LDS(int num) {
		if(visit_LDS[num]==-1) {
			visit_LDS[num]=1;
			
			for(int j=num+1;j<=N;j++) { // arr[num]�� �� ����
				if(arr[j]<arr[num])
					dp_LDS[num]=Math.max(LDS(j)+1,dp_LDS[num]);
			}
		}
		return dp_LDS[num];
		

	}
}
