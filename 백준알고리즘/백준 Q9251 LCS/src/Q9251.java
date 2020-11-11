import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

		//  LCS�� ��ȯ���� ���ã�⿡.....

public class Q9251 {
	
	static String str1;
	static String str2;
	static Integer[][] LCS_arr;

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		str1=br.readLine(); // ��
		str2=br.readLine(); // ��
		LCS_arr=new Integer[str1.length()+1][str2.length()+1]; // ��� ���� �� ������ 0���� �е�.
		
		System.out.println(LCS(str1.length(),str2.length()));
	}
	public static int LCS(int row, int col) {
		if(row==0 || col==0) { // 1�� 1���� 0���� �е�
			LCS_arr[row][col]=0; 
		}
		
		if(LCS_arr[row][col]==null) {
			if(str1.charAt(row-1)==str2.charAt(col-1)) { // str1 ���ڿ� str2 ���ڰ� ���ٸ�
				LCS_arr[row][col]=LCS(row-1,col-1)+1; // �ش� LCS_arr �迭���� �밢������ +1�� ��
			}
			else if(str1.charAt(row-1)!=str2.charAt(col-1)) { // �� ���ڰ� ���� �ʴٸ�
				LCS_arr[row][col]=Math.max(LCS(row-1,col), LCS(row,col-1)); // �ش� �迭���� ���� or ������ max������ +1�� ��
			}
		}
			return LCS_arr[row][col];

	}
}
