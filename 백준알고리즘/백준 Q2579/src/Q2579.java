import java.io.*;

/*시작 - / 0 1 2 3 4 5 (계단의 개수=6)

(1)
모든 계단에서 
f(n)-2 // 2계단 한번에 내려옴
f(n)-1 // 이럴려면 조건이 있음(그 전에 한 계단을 움직였으면 안됨)

(2)
마지막-1 계단을 밟거나 or 마지막-2 계단을 밟거나

*****선택할 것은 지금까지 중 최대값일 때*****
*/

public class Q2579 {

	static int N; // 계단의 개수
	static int[] stair; // 계단 점수 담은 배열
	static int[] dp; // 메모이제이션 배열
	static int[] what_stair; // 계단 오른 만큼을 저장함


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		stair = new int[N];
		dp=new int[N]; // 방문을 표시할 배열
		what_stair=new int[N];
		
		for (int i = 0; i < N; i++) {
			stair[i] = Integer.parseInt(br.readLine());
			dp[i]=-1; // 방문 안 한 걸 -1로 초기화
		}
		
		dp[N-1]=stair[N-1];
		
		memoization(N-2);
		memoization(N-3);
		// 마지막 계단에서 시작해서 첫번째 계단까지  ex) N=6일 때 dfs(4) or dfs(3)

	}
	public static int memoization(int num) {
		if(num==N-2)
			
		if(dp[num]==-1) { // 방문한 적이 없다면 
			
			if(what_stair[num+1]!=1) { // 전에 것이 1계단 오른게 아니라면
				if(memoization(num-1)>memoization(num-2)) {
					what_stair[num]=1;
					dp[num]=
				}
				dp[num]=Math.max(memoization(num-1), memoization(num-2))+stair[num];
			}
			else {
				what_stair[num]=2;
				dp[num]=memoization(num-2)+stair[num];
			}
		}
		return dp[num]; // 방문한 적이 있다면 (재귀호출로 이미 최대값을 찾은 상태라면)
	}

}