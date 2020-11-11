import java.io.*;
import java.util.*;

class Arr implements Comparable<Arr>{
	int start;
	int end;
	
	@Override
	public int compareTo(Arr a1) { // 오름차순
		if(this.end<a1.end) {
			return -1; 
		}
		else if(this.end==a1.end) {
			// 끝나는 시간이 같을 경우 시작시간으로 정렬
			if(this.start<a1.start)
				return -1;
			else if(this.start==a1.start)
				return 0;
			else
				return 1;
		}
		else {
			return 1;
		}
	}
}

public class Q1931 {

		static int N; // 회의의 수		

		
		//static int[] dp;
		//static int[] visit;
		static Arr[] arr;

		public static void main(String[] args) throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st=new StringTokenizer(br.readLine());
			
			N=Integer.parseInt(st.nextToken());
			arr=new Arr[N];

			//dp=new int[N]; //
			//visit=new int[N];
			
			for(int i=0;i<N;i++) {
				st=new StringTokenizer(br.readLine());
				
				Arr tmp=new Arr();
				
				tmp.start=Integer.parseInt(st.nextToken());
				tmp.end=Integer.parseInt(st.nextToken());
				
				arr[i]=tmp;
				//dp[i]=1;
			}
			
			Arrays.sort(arr); // end를 기준으로 오름차순 (=가장 빨리 끝나는 순)
			
			int tmp_end=arr[0].end;
			int cnt=0;
			
			for(int i=1;i<N;i++) {
				if(tmp_end<=arr[i].start) {
					tmp_end=arr[i].end;
					cnt++;
				}
			}
			System.out.println(cnt+1);
	}
		
		
		/*public static int greedy(int index) { // Bottom-up
			
			if(visit[index]==0) {
				visit[index]=1;
				for(int i=index-1;i>=0;i--) {

					if(arr[index].start>=arr[i].end) {
						dp[index]=Math.max(dp[index], greedy(i)+1);
						
					}
				}
			}
			return dp[index];
		}*/

}
