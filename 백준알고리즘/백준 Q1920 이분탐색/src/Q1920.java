import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1920 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		String[] tmp=br.readLine().split(" ");
		int[] arr=new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(tmp[i]);
		}
		Arrays.sort(arr);
		
		int M=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		for(int i=0;i<M;i++) {
			int tmp2=Integer.parseInt(st.nextToken());
			System.out.println(BSearch(arr,tmp2));
		}
	}
	
	public static int BSearch(int[] arr, int target) {
		int low=0;
		int high=arr.length-1;
		int mid;
		while(low<=high) {
			mid=(low+high)/2;
			
			if(arr[mid]==target)
				return 1;
			else if(arr[mid]>target)
				high=mid-1;
			else
				low=mid+1;

		}
		return 0;
	}

}
