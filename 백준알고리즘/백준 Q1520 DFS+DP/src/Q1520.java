import java.io.*;
import java.util.*;
					/*DFS+DP ���� �ȵǸ� �ϸ�ũ�� ���� ����*/
public class Q1520 {
	
	static int row,col;
	static int[][] map;
	static int[][] memoization; // �湮�� ǥ���� �迭
	
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
				memoization[i][j]=-1; // �湮���� �ʱ�ȭ
			}
		}
		//bw.write(String.valueOf(dfs(0,0)));
        //bw.flush();
		System.out.println(dfs(0,0));
		}
	
						/*dfs + memoization*/
			/*dfs: ��� ����� ���� Ž��(����� ���� �켱�� ��)*/
	
	public static int dfs(int x, int y) {
		if(x==row-1 && y==col-1) { // ������ �����ϸ�
			return 1; // ����� �� 1�� ������
		}
		if(memoization[x][y]==-1) { // ����� ���� ���� ���� ����, �湮�� ���� ������
			memoization[x][y]=0;
			
			if(x>0&&map[x][y]>map[x-1][y]) { // ���� �̵�
				memoization[x][y]+=dfs(x-1,y);
			}
			if(x<row-1&&map[x][y]>map[x+1][y]){// �Ʒ��� �̵�
				memoization[x][y]+=dfs(x+1,y);
			}
			if(y>0&&map[x][y]>map[x][y-1]) {// �������� �̵�
				memoization[x][y]+=dfs(x,y-1);
			}
			if(y<col-1&&map[x][y]>map[x][y+1]) { //���������� �̵�
				memoization[x][y]+=dfs(x,y+1);
			}
		}
		return memoization[x][y]; // �̹� �ͺô� ��ζ�� ���� ����� ���� ������
		
	}

}
