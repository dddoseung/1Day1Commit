import java.io.*;
import java.util.*;

public class Q9663 {

	static int N; // N x N인 체스판 위에 퀸 N개를 서로 공격 못하게 배치
	static int[] arr; // 체스 말에 각 행의 위치라고 생각
	static int count=0; // 경우의 수 카운트다운
	
	/*
	 * 1. 재귀호출을 어떻게 할 것인가
	 * 2. 퀸을 놓을 수 있는 지 여부를 조건문으로 판별할 것인가
	 */
	
	public static void NQueen(int depth) { // 재귀호출 부분
		if(depth==N) { // 행을 다 채웠으면 카운트다운 1 증가시키고 "리턴"시킴
			count++;
			return;
		}
		
		for(int i=0;i<N;i++) {
				//  (arr[depth]=i;) O
				
				if(possible(depth,i)) {
					arr[depth]=i; //!!!조건이 맞으면 바꾸고
					NQueen(depth+1);
					/*			dfs재귀호출을 for문 안에서				*/
					
				}
				else {
					arr[depth]=0;
					return;
				}
		}
	}
	
	public static boolean possible(int num,int value) { // 퀸을 놓을 수 있는 조건 판별
		for(int i=0;i<num;i++) { // !!! num(=지금 depth 바로 전)까지만 검사
			if(arr[i]==value) { // 같은 열일 경우
				return false;
			}
			else if(Math.abs(num-i)==Math.abs(value-arr[i])) { // 대각선일 경우
				      // 열의 차와 행의 차가 같을 경우가 대각선에 놓인 경우이다.
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(st.nextToken()); 
		arr=new int[N];
		
		NQueen(0);
		System.out.println(count);
	}

}
