import java.io.*;

/* ���� �����ϸ� ������ ���� or ��Ÿ�� ���� ��� ���� �𸣁���*/

public class Q2580 {
	
	static int[][] arr=new int[9][9];
	static int cnt=0; // 0�� ���� ����
	
	public static void sdoq(int r,int c) { // ����Լ� ȣ��
		if(c==9) {
			sdoq(r+1,0); ///
			return;
		}
		if(cnt==0) { // ���� ��� ä������
			for(int a=1;a<=9;a++) { // ������ ���� �����
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
					arr[r][c]=i;  // !!!������ ������ �ٲٰ�
					cnt--;
					sdoq(r,c+1);
					}
				else
					continue;
				}
			arr[r][c]=0; ///
			return; ///
			}
		sdoq(r,c+1); /// !!! ���� ������ �°� ä���� ���̸� �Ѿ����.....
		
	}
	
	public static boolean possible(int r, int c, int value) { // �������� ( value ������ �� �ʿ���)
		for(int i=0;i<9;i++) {
			if(arr[r][i]==value) // ���� �� �ȵ�
				return false;
		}
		for(int i=0;i<9;i++) {
			if(arr[i][c]==value) // ���� �� �ȵ�
				return false;
		}
		int tmp_r=(r/3)*3; // 3x3�� ���� ù ��ġ
		int tmp_c=(c/3)*3; // 3x3�� ���� ù ��ġ
		
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
		
		for(int a=1;a<=9;a++) { // ������ ���� �Է� ����
			split=br.readLine().split(" ");
			for(int b=1;b<=9;b++) {
				arr[a-1][b-1]=Integer.parseInt(split[b-1]);
				if(arr[a-1][b-1]==0)
					cnt++; // 0 ã���� ����
			}
		}
		
		sdoq(0,0);

	}

}
