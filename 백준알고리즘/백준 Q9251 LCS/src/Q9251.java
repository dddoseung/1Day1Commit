import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

		//  LCS의 순환식은 즐겨찾기에.....

public class Q9251 {
	
	static String str1;
	static String str2;
	static Integer[][] LCS_arr;

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		str1=br.readLine(); // 행
		str2=br.readLine(); // 열
		LCS_arr=new Integer[str1.length()+1][str2.length()+1]; // 행과 열의 맨 앞쪽은 0으로 패딩.
		
		System.out.println(LCS(str1.length(),str2.length()));
	}
	public static int LCS(int row, int col) {
		if(row==0 || col==0) { // 1행 1열은 0으로 패딩
			LCS_arr[row][col]=0; 
		}
		
		if(LCS_arr[row][col]==null) {
			if(str1.charAt(row-1)==str2.charAt(col-1)) { // str1 문자와 str2 문자가 같다면
				LCS_arr[row][col]=LCS(row-1,col-1)+1; // 해당 LCS_arr 배열값의 대각선에서 +1한 값
			}
			else if(str1.charAt(row-1)!=str2.charAt(col-1)) { // 두 문자가 같지 않다면
				LCS_arr[row][col]=Math.max(LCS(row-1,col), LCS(row,col-1)); // 해당 배열값의 윗쪽 or 왼쪽의 max값에서 +1한 값
			}
		}
			return LCS_arr[row][col];

	}
}
