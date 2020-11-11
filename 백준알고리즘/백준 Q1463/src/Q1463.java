import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
 * 초기 생각: 
 3의 배수이면 3으로 나누고(1번연산) 
2의 배수이면 -1을 했을 때 3의 배수가 되면 3으로 나눔(1번 연산)
2의 배수이면 -1을 했을 때 3의 배수가 안되면 -1을 안하고 2로 바로 나눔
2의 배수도 아니고 3의 배수도 아니면 1을 뺌(3번 연산)
     즉, 연산의 순서를 정하였음
*/
/*----------------------------------------------------*/
/*
 * 맞는 풀이:
 * 모든 수에 대해서 저 위의 연산 순서로 단정지을 수 없음 (숫자마다 다 다르다)
 * 즉, 재귀호출임을 이용하여 저 세개의 재귀호출의 최솟값을 Math.min으로 결정하면 됨
 * 두 개만 사용할 수 있을 때에도 Math.min 이용
 */


 
public class Q1463 {
 
	static int N; // 1<=N<=10^6
	static int[] dp; // 연산의 최솟값을 담은 배열  (주의: N일 때 dp[N-1]에 저장됨)
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine()); // 정수 N입력
		dp=new int[N];
		
		for(int i=0;i<dp.length;i++) {
			//이렇게 해주는 이유: N<=2일 때는 dp size가 N이므로, 초기값 설정을 dp[N-1]까지만 해줘야 함
			if(i==0) 
				dp[0]=0;
			else if(i==1)
				dp[1]=1;
			else if(i==2)
				dp[2]=1;
			else
				dp[i]=-1; // -1로 초기화
		}
		
		
		System.out.println(memoization(N));
	}

	public static int memoization(int N) { // 재귀호출

		if(dp[N-1]==-1) { // 저장 안되어있으면
			if(N%2==0 && N%3==0) { // 2로도 나눠지고 3으로도 나눠진다면
				dp[N-1]=Math.min(Math.min(memoization(N/2), memoization(N/3)),memoization(N-1))+1;
			}
			else if(N%2==0 && N%3!=0) { // 3으로 안 나눠지면
				dp[N-1]=Math.min(memoization(N/2),memoization(N-1))+1;
			}
			else if(N%2!=0 && N%3==0) { // 2로 안 나눠지면
				dp[N-1]=Math.min(memoization(N/3), memoization(N-1))+1;
			}
			else { // 2로도 안나눠지고 3으로도 안나눠지면
				dp[N-1]=memoization(N-1)+1;
			}
		}
		return dp[N-1];
	}
}
