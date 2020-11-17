import java.io.*;
import java.util.Arrays;
//전형적인 이분탐색 문제

public class Q1654 {
	
	static int N;
	static long[] arr;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		int K=Integer.parseInt(str[0]); //갖고있는 랜선의 개수
		N=Integer.parseInt(str[1]); //필요한 랜선의 개수
		
		arr=new long[K];
		for(int i=0;i<K;i++) {
			arr[i]=Long.parseLong(br.readLine());
		}
		
		Arrays.sort(arr);
		System.out.print(BSearch(arr));
	}

	public static long BSearch(long[] arr) { 
							// 전형적인 이분탐색이지만, low와 high의 값이 index값이 아니다.
		long mid=0;
		long low=1; // 랜선의 길이는 2^31-1보다 작거나 같은 `자연수`
		long high=arr[arr.length-1];

		while(low<=high) {
			int cnt=0;
			mid=(low+high)/2;
			for(long a:arr) {
				cnt+=a/mid;
			}
			if(cnt>=N)
				low=mid+1;
			
			else
				high=mid-1;

		}
		return high; 								
								//   답이 32일 때,
	    						//
								//		low 33 high 40
								//
								//		low 33 high 35
								//
								//		low 33 high 33
								//
								//		low 33 high 32 
							    //
								//     반복문 빠져나옴
	}
}
