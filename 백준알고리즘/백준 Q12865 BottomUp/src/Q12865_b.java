import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Q12865_b{
    
    static int[] W; // 무게
    static int[] V; // 가치
    static int[][] dp; // knapsack 표
    
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int N=Integer.parseInt(st.nextToken()); // 물품의 수
        int K=Integer.parseInt(st.nextToken()); // 최대무게
        W=new int[N+1]; // * index=1부터 시작
        V=new int[N+1]; // *
        dp=new int[N+1][K+1];
        
        for(int i=1;i<=N;i++){
            st=new StringTokenizer(br.readLine());
            
            W[i]=Integer.parseInt(st.nextToken());
            V[i]=Integer.parseInt(st.nextToken());
        }
        
        /* 이 작업은 knapsack 표(=dp[][] 배열)를 채우기 위함이다 */
        
        for(int i=1;i<=N;i++){ // i번째 물품
            for(int k=0;k<=K;k++){ // 최대 무게가 k일 때
                if(k>=W[i]){ // 현재 물품을 넣을 수 있는 경우
                    dp[i][k]=Math.max(dp[i-1][k],dp[i-1][k-W[i]]+V[i]);
                }
                else{ // 현재 물품을 넣을 수 없는 경우
                    dp[i][k]=dp[i-1][k];
                }
            }
        }
        
        System.out.println(dp[N][K]);
    }
}