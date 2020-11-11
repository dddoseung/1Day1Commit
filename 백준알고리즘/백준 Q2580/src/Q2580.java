import java.io.*;

/* 백준 제출하면 컴파일 에러 or 런타임 에러 뜬다 이유 모르곘음*/

public class Q2580 {
	
	static int[][] arr=new int[9][9];
	static int cnt=0; // 0의 개수 받음
	
	public static void sdoq(int r,int c) { // 재귀함수 호출
		if(c==9) {
			sdoq(r+1,0); ///
			return;
		}
		if(cnt==0) { // 판을 모두 채웠으면
			for(int a=1;a<=9;a++) { // 스토쿠 숫자 출력함
				for(int b=1;b<=9;b++) {
					System.out.print(arr[a-1][b-1]+" ");
				}
				System.out.println();
			}
			System.exit(0); ////
		}
		
		if(arr[r][c]==0) {
			for(int i=1;i<=9;i++) {					
				//  (arr[r][c]=i;)  X
				
				if(possible(r,c,i)) {
					arr[r][c]=i;  // !!!조건이 맞으면 바꾸고
					cnt--;
					sdoq(r,c+1);
					}
				else
					continue;
				}
			arr[r][c]=0; ///
			return; ///
			}
		sdoq(r,c+1); /// !!! 만약 스토쿠가 맞게 채워진 곳이면 넘어가야지.....
		
	}
	
	public static boolean possible(int r, int c, int value) { // 가능조건 ( value 변수가 꼭 필요함)
		for(int i=0;i<9;i++) {
			if(arr[r][i]==value) // 같은 행 안됨
				return false;
		}
		for(int i=0;i<9;i++) {
			if(arr[i][c]==value) // 같은 열 안됨
				return false;
		}
		int tmp_r=(r/3)*3; // 3x3의 행의 첫 위치
		int tmp_c=(c/3)*3; // 3x3의 열의 첫 위치
		
		for(int i=tmp_r;i<tmp_r+3;i++) {
			for(int j=tmp_c;j<tmp_c+3;j++) {
				if(arr[i][j]==value) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] split;
		
		for(int a=1;a<=9;a++) { // 스토쿠 숫자 입력 넣음
			split=br.readLine().split(" ");
			for(int b=1;b<=9;b++) {
				arr[a-1][b-1]=Integer.parseInt(split[b-1]);
				if(arr[a-1][b-1]==0)
					cnt++; // 0 찾으면 증가
			}
		}
		
		sdoq(0,0);

	}

}
