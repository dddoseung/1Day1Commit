import java.io.*;
import java.util.*;
					/*DFS+DP 이해 안되면 북마크에 설명 있음*/
public class Q1520 {
	
	static int row,col;
	static int[][] map;
	static int[][] memoization; // 방문을 표시할 배열
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		row=Integer.parseInt(st.nextToken());
		col=Integer.parseInt(st.nextToken());
		
		map=new int[row][col];
		memoization=new int[row][col];
		
		for(int i=0;i<row;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<col;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
				memoization[i][j]=-1; // 방문여부 초기화
			}
		}
		//bw.write(String.valueOf(dfs(0,0)));
        //bw.flush();
		System.out.println(dfs(0,0));
		}
	
						/*dfs + memoization*/
			/*dfs: 모든 경우의 수를 탐색(방법이 깊이 우선일 뿐)*/
	
	public static int dfs(int x, int y) {
		if(x==row-1 && y==col-1) { // 종점에 도달하면
			return 1; // 경로의 수 1을 리턴함
		}
		if(memoization[x][y]==-1) { // 경로의 수가 계산된 적이 없고, 방문한 적이 없으면
			memoization[x][y]=0;
			
			if(x>0&&map[x][y]>map[x-1][y]) { // 위로 이동
				memoization[x][y]+=dfs(x-1,y);
			}
			if(x<row-1&&map[x][y]>map[x+1][y]){// 아래로 이동
				memoization[x][y]+=dfs(x+1,y);
			}
			if(y>0&&map[x][y]>map[x][y-1]) {// 왼쪽으로 이동
				memoization[x][y]+=dfs(x,y-1);
			}
			if(y<col-1&&map[x][y]>map[x][y+1]) { //오른쪽으로 이동
				memoization[x][y]+=dfs(x,y+1);
			}
		}
		return memoization[x][y]; // 이미 와봤던 경로라면 계산된 경로의 수를 리턴함
		
	}

}
