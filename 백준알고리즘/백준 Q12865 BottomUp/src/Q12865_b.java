import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Q12865_b{
    
    static int[] W; // ����
    static int[] V; // ��ġ
    static int[][] dp; // knapsack ǥ
    
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int N=Integer.parseInt(st.nextToken()); // ��ǰ�� ��
        int K=Integer.parseInt(st.nextToken()); // �ִ빫��
        W=new int[N+1]; // * index=1���� ����
        V=new int[N+1]; // *
        dp=new int[N+1][K+1];
        
        for(int i=1;i<=N;i++){
            st=new StringTokenizer(br.readLine());
            
            W[i]=Integer.parseInt(st.nextToken());
            V[i]=Integer.parseInt(st.nextToken());
        }
        
        /* �� �۾��� knapsack ǥ(=dp[][] �迭)�� ä��� �����̴� */
        
        for(int i=1;i<=N;i++){ // i��° ��ǰ
            for(int k=0;k<=K;k++){ // �ִ� ���԰� k�� ��
                if(k>=W[i]){ // ���� ��ǰ�� ���� �� �ִ� ���
                    dp[i][k]=Math.max(dp[i-1][k],dp[i-1][k-W[i]]+V[i]);
                }
                else{ // ���� ��ǰ�� ���� �� ���� ���
                    dp[i][k]=dp[i-1][k];
                }
            }
        }
        
        System.out.println(dp[N][K]);
    }
}