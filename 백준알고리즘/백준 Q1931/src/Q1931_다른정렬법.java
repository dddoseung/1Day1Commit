import java.io.*;
import java.util.*;

public class Q1931_다른정렬법 {
	static int N; // 회의의 수		

	static int[][] arr;

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(st.nextToken());
		arr=new int[N][2];
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			arr[i][0]=Integer.parseInt(st.nextToken());
			arr[i][1]=Integer.parseInt(st.nextToken());
			
		}
		
		/***********************************/
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] a1, int[] a2) { 
				if(a1[1] == a2[1]) {
					//종료시간이 같을 경우 시작시간으로 정렬
					return Integer.compare(a1[0],a2[0]);
				}
				return Integer.compare(a1[1],a2[1]);
			}
		});
		
		int count=0;
		int end=arr[0][1];
		
		for(int i=1;i<N;i++) {
			if(arr[i][0]>=end) {
				end=arr[i][1];
				count++;
			}
		}
		System.out.println(count+1);

	}
}

