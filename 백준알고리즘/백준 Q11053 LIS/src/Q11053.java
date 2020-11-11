import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*LIS
 * 
 * 각 숫자는 자기 순서가 왔을 때 이미 LIS를 계산한 상태여아 함 -> dp사용

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
		arr=new int[N+1]; // 1부터 시작
		dp=new int[N+1]; // 1부터 시작
		visit=new int[N+1]; // dp의 방문표시
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			dp[i]=1; // 1로 초기화
			visit[i]=-1;
		}

		for(int i=1;i<=N;i++) { // 수열의 몇번째가 가장 긴 지 모르기 때문에 이 작업해줌
			max=Math.max(LIS(i), max);
		}
		System.out.println(max);
	}
	public static int LIS(int index) { // 수열의 첫번째 원소부터 탐색해서 가장 큰 수를 기억하고 있다가 이 숫자보다 큰 애를 만나면 증가시킴
		if(visit[index]==-1) { // 방문을 한 적이 없을 때
			visit[index]=1; // 방문표시를 해주고
			
			for(int n=1;n<index;n++) {
			//for(int n=index-1;n>=1;n--) {
					if(arr[n]<arr[index]) {
						dp[index]=Math.max(LIS(n)+1,dp[index]); // 수열을 돌면서 가장 큰 수+1를 dp에 저장하고 재귀호출하며 비교
					}
			}
		}
		//이미 LIS 함수를 방문했다면 바로 리턴
		return dp[index];
	}
}
