import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
//LIS
public class Q12015 {
	static int N; // ������ ũ�� N
	static int[] arr; // ������ ���� �迭
	
	static int[] dp_LIS; // �޸������̼�
	static int[] visit_LIS; // dp�� �湮�ߴ°�(����Ǿ��ִ°�)�� ��� �迭
    
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
			dp_LIS[i]=1; // 1�� �ʱ�ȭ**
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
