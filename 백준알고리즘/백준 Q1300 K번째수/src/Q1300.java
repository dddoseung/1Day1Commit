import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
	이 문제는 NxN 크기의 배열을 만들면 안됨.
	1. 만들면 / 2.  이분탐색의 high를 arr[N][N]으로 하면
	메모리 초과 뜸....
*/
public class Q1300 {
	static int N;
	static long k;
//	static long[][] arr;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		k=Long.parseLong(br.readLine());
//		arr=new long[N][N];
//
//		for(int i=1;i<=N;i++) {
//			for(int j=1;j<=N;j++) {
//				arr[i-1][j-1]=i*j;
//			}
//		}
		System.out.print(func());
	}
	
		public static long func() {
			long low=1;
//			int high=arr[N-1][N-1];
			long high=k;
			long mid=0;
			
			while(low<=high) {
				int cnt=0;
				mid=(low+high)/2; // S
				
				for(int i=1;i<=N;i++) {
						cnt+=Math.min(N, mid/i); // k
				}
				
				if(cnt<k) {
					low=mid+1;
				}
				else {
					high=mid-1;
				}
			}
			return high+1;
		}
	
	
}
