import java.util.Scanner;
public class Q2740 {
	static int[][] arr1;
	static int[][] arr2;
	static int[][] final_arr;
	static StringBuffer sb; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sb=new StringBuffer();
		int row1=sc.nextInt();
		int col1=sc.nextInt();
		arr1=new int[row1+1][col1+1];
		
		for(int i=1;i<=row1;i++) {
			for(int j=1;j<=col1;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		
		int row2=sc.nextInt();
		int col2=sc.nextInt();
		arr2=new int[row2+1][col2+1];
		
		for(int i=1;i<=row2;i++) {
			for(int j=1;j<=col2;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		sc.close();
		func(arr1,arr2);
		System.out.print(sb);
		
	}
	public static void func(int[][] arr1, int[][] arr2) {
		final_arr=new int[arr1.length][arr2[0].length]; //arr1의 행을 따르고, arr2의 열을 따름
		//arr1의 행이 더 많았으면 결과도 행이 더많음
		//arr2의 열이 더 많았으면 결과도 열이 더많음
		
		for(int r=1;r<final_arr.length;r++) {
			for(int c=1;c<final_arr[0].length;c++) {
				for(int k=1;k<arr2.length;k++) {
					final_arr[r][c]+=arr1[r][k]*arr2[k][c];
				}
			}
		}
		
		for(int i=1;i<final_arr.length;i++) {
			for(int j=1;j<final_arr[0].length;j++) {
				//System.out.print(final_arr[i][j]+" ");
				sb.append(final_arr[i][j]+" ");
			}
			//System.out.println();
			sb.append("\n");
		}
	}

}
