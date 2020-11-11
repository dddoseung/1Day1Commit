import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Q15652 { 
 
	public static int N;	// 정적변수로 변경
	public static int M;	// 정적변수로 변경
	public static int[] arr;

	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
 
		// 정적변수 N과 M을 초기화해준다.
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
 
		arr = new int[M];
        
		// 정적변수를 쓰면 되기 때문에 굳이 N과 M을 넘겨줄 필요 없다.
		dfs(0,1);
		System.out.println(sb);
 
	}

	public static void dfs(int depth, int start) {
		/*
		 깊이가 최대 깊이일경우
		 더이상 탐색할 자식노드는 없으므로 return해준다.
		*/
		if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return; ///
		}
		/*
		 
		*/
		for (int i = start; i <=  N; i++) {
			
			arr[depth] = i ;
			dfs(depth + 1,i);
			 	
		}
	}
} 
