import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/* "모든 동전들은 서로 배수 관계에 놓여있다" 
 *  최소한의 개수이므로 당연히 가장 큰 가치를 지닌 동전부터 선택해야 함*/

public class Q11047 {
	
	static int N; // 동전은 총 N종류
	static int K; // 가치의 합 K를 만들어야 함
	
	static int[] arr; // 동전의 종류를 담는 배열
	static int min=0; // 최솟값

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		
		arr=new int[N+1]; // index=1부터!!
		for(int i=1;i<=N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=N;i>0;i--) {
			if(K>=arr[i]) { // 가치의 합이 동전의 종류보다 작아야함
				min+=K/arr[i];
				K=K%arr[i];
			}
		}
		//Coin(K);
		System.out.println(min);
		
		
	}
	
	/* 다른 방법: 재귀함수 이용
	public static int Coin(int money) {
		
		int tmp=0;
		
		if(money==0) {
			return 0;
		}
		else {
			for(int i=N;i>0;i--) {
				tmp=money/arr[i];
				if((tmp)!=0) { 
					min+=tmp;
					return Coin(money%arr[i]);
				}
			}
		}
		return 0;
	}
	*/
}
