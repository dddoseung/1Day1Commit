import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
//LIS
public class Q12015 {
	static int N; // 수열의 크기 N
	static int[] arr; // 수열을 담은 배열
	
	static int[] dp_LIS; // 메모이제이션
	static int[] visit_LIS; // dp를 방문했는가(저장되어있는가)를 담는 배열
    
    public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
        N=Integer.parseInt(br.readLine());
		arr=new int[N];
		
		dp_LIS=new int[N];
		visit_LIS=new int[N]; 
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			dp_LIS[i]=1; // 1로 초기화**
		}
        
        int max=0;
        for(int i=0;i<N;i++){
            max=Math.max(LIS(arr[i]),max);
        }
        System.out.print(max);
        
    }
    public static int LIS(int num){
        
        if(visit_LIS[num]!=0){
            return dp_LIS[num];
        }
        else{
            visit_LIS[num]=1;
            for(int i=0;i<num;i++){
                if(arr[num]>arr[i])
                    dp_LIS[num]=Math.max(dp_LIS[num],LIS(i)+1);
            } 
            return dp_LIS[num];
        }
        
    }
}
