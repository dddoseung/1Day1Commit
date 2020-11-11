import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Q15650 { /* 조합 */
	
	static int n,m;
	static int[] arr;
	static StringBuilder sb=new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		
		arr=new int[m];
		dfs(0,1);
		System.out.println(sb);
	}
	
	public static void dfs(int cnt, int start) {
		if(cnt==m) {
			for(int val:arr) {
				sb.append(val).append(" ");
			}
			sb.append('\n');	
			return;
		}
		
		for(int i=start;i<=n;i++) {
			arr[cnt]=i; // 현재 arr 배열에 i가 담김
			dfs(cnt+1,i+1); // 다음 재귀는 i 값보다 1이 큰 수부터 탐색
			/*			dfs재귀호출을 for문 안에서				*/
		}
	}
}
