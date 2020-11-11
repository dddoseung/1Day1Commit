import java.io.*;
import java.util.*;

public class Q14888{
	
	static int N;
	static int An[];
	static int operator[];
	static int ans, min, max;
	
	public static void main(String[] args) throws IOException {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			N= Integer.parseInt(br.readLine());
			An = new int[N];
	 
			// 숫자 입력 
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < N; i++) {
				An[i] = Integer.parseInt(st.nextToken());
			}
			
			//오퍼레이션 개수 입력
			st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < 4; i++) {
				operator[i] = Integer.parseInt(st.nextToken());
			}
			ans=An[0];
			dfs(operator,0,0);
			
			System.out.println(min+" "+max);
	}
	
	public static void dfs(int[] operator,int index, int cnt) {
		
		if(index==N) {
			if(min==0 && max==0) {
				min=ans;
				max=ans;
			}
			else {
				if(min>=ans)
					min=ans;
				if(max<=ans)
					max=ans;
			}
			return;
		}

		for(int i=0;i<4;i++) {
			if(operator[i]>0) {
				operator[i]--;
				
				switch(i) {
					case 0: 
						ans+=An[index+1]; break;
					case 1:
						ans-=An[index+1]; break;
					case 2:
						ans*=An[index+1]; break;
					case 3:
						ans/=An[index+1]; break;
				}
				dfs(operator,index+1);
				operator[index]++;
			}
		
		}
		
	}
}