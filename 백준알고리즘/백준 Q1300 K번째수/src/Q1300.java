import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1300 {
	static int N;
	static long k;
	static long[] B_arr;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		k=Long.parseLong(br.readLine());
		B_arr=new long[(N*N)+1];
		
		int idx=0;
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				B_arr[++idx]=i*j;
			}
		}
		
		Arrays.sort(B_arr);
		System.out.print(B_arr[(int) k]);
		
	}

}
