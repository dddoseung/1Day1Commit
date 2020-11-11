import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
//LIS+LDS
public class Q11054 {
	static int N; // 수열의 크기 N
	static int[] arr; // 수열을 담은 배열
	
	static int[] dp_LIS; // 메모이제이션
	static int[] visit_LIS; // dp를 방문했는가(저장되어있는가)를 담는 배열

	static int[] dp_LDS;
	static int[] visit_LDS;
	
	static int max=1;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		arr=new int[N+1]; // 1부터 시작
		
		dp_LIS=new int[N+1]; // 1부터 시작
		visit_LIS=new int[N+1]; // dp의 방문표시
		
		dp_LDS=new int[N+1]; // 1부터 시작
		visit_LDS=new int[N+1]; // dp의 방문표시
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			
			dp_LIS[i]=1; // 1로 초기화
			visit_LIS[i]=-1;
			
			dp_LDS[i]=1;
			visit_LDS[i]=-1;
		}
		
		for(int i=1;i<=N;i++) {
			max=Math.max(LIS(i)+LDS(i)-1, max);
		}
		System.out.println(max);
		
	}
	
	/*최장 증가 부분수열*/
	public static int LIS(int num) { // num은 index임
		if(visit_LIS[num]==-1) {
			visit_LIS[num]=1; //
			
			for(int i=1;i<num;i++) { // arr[num]의 전 수열
				if(arr[i]<arr[num])
					dp_LIS[num]=Math.max(LIS(i)+1, dp_LIS[num]);
			}
		}
		return dp_LIS[num];
	}
	
	/*최장 감소 부분수열*/
	public static int LDS(int num) {
		if(visit_LDS[num]==-1) {
			visit_LDS[num]=1;
			
			for(int j=num+1;j<=N;j++) { // arr[num]의 후 수열
				if(arr[j]<arr[num])
					dp_LDS[num]=Math.max(LDS(j)+1,dp_LDS[num]);
			}
		}
		return dp_LDS[num];
		

	}
}
