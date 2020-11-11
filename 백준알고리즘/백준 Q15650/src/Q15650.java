import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Q15650 { /* ���� */
	
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
			arr[cnt]=i; // ���� arr �迭�� i�� ���
			dfs(cnt+1,i+1); // ���� ��ʹ� i ������ 1�� ū ������ Ž��
			/*			dfs���ȣ���� for�� �ȿ���				*/
		}
	}
}
