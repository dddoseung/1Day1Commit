import java.util.*;
import java.io.*;

public class Q11399 {

	static int N;
	static int[] P_arr;
	//static int[] total_arr;
	static int count=0;
	
	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		P_arr=new int[N];
		//total_arr=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int a=0;
		while(st.hasMoreTokens()) {
			P_arr[a]=Integer.parseInt(st.nextToken());
			a++;
		}
		
		Arrays.sort(P_arr); // 기본 오름차순
		
		for(int i=0;i<P_arr.length;i++) {
			for(int j=i;j>=0;j--) {
				count+=P_arr[j];
			}
		}
		
		System.out.println(count);
	}

}
