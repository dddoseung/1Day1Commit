import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2805 {
	static int N; // 나무의 수
	static long M; // 상근이가 집으로 가져가려고 하는 나무의 길이 M
	static long[] arr;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		N=Integer.parseInt(str[0]); 
		M=Long.parseLong(str[1]);
		arr=new long[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++) {
			arr[i]=Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		System.out.print(func(arr));
	}
		
	public static long func(long[] arr) {
		if(M==1) {
			return arr[N-1]-1;
		}
		long low=1;
		long high=arr[N-1];
		long mid;
		
		while(low<=high) {
			long tmp=0;
			mid=(low+high)/2;
			
			for(long a: arr) {
				if(a<=mid) {}
				else {
					tmp+=a-mid;
				}
			}
			if(tmp==M) {
				return mid;
			}
			else if(tmp>M) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return high;
	}
}
