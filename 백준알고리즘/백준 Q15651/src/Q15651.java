import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Q15651 { 
 
	public static int N;	// ���������� ����
	public static int M;	// ���������� ����
	public static int[] arr;

	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
 
		// �������� N�� M�� �ʱ�ȭ���ش�.
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
 
		arr = new int[M];
        
		// ���������� ���� �Ǳ� ������ ���� N�� M�� �Ѱ��� �ʿ� ����.
		dfs(0);
		System.out.println(sb);
 
	}

	public static void dfs(int depth) {
		/*
		 ���̰� �ִ� �����ϰ��
		 ���̻� Ž���� �ڽĳ��� �����Ƿ� return���ش�.
		*/
		if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return; ///
		}
		/*
		 ���̸� 1�� ������Ű�鼭 DFS��
		 ���ȣ���Ѵ�.
		*/
		for (int i = 0; i < N; i++) {
				arr[depth] = i + 1;
				dfs(depth + 1);

		}
	}
} 
