import java.util.Scanner;
import java.util.Arrays;

public class Q10830 {
	static long[][] arr; // ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(); // ����� ũ�� NxN
		long B=sc.nextLong(); // ����� B��ŭ ����
		arr=new long[N][N];
		
		for(int r=0;r<N;r++) {
			for(int c=0;c<N;c++) {
				arr[r][c]=sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(func(B)));
		
	}
	
//	public static long[][] pow(long[][] n, long B) {
//		if(B==1) {
//			return n;
//		}
//		long[][] num=func(n,(B/2)); // ������ ���� ����� num�� �����ϰ�
//		long[][] tmp=num*num%1000; // �̹� ���� num�� �ܼ��������ش�.
//		
//		if(B%2==0) {
//			
//			return tmp;
//		}
//		else
//			return (tmp*n)%1000;
//	}
	public static long[][] func(long b) { // ��� ����
		long[][] active_arr=new long[arr.length][arr[0].length];
		long[][] tmp=new long[arr.length][arr[0].length];
		if(b==1) {
			return arr;
		}
//		else {
//			for(int i=0;i<arr.length;i++) {
//				for(int j=0;j<arr[0].length;j++) {
//					for(int k=0;k<arr[0].length;k++) {
//						tmp[i][j]+=(active_arr[i][k]*arr[k][j])%1000;
//					}
//				}
//			}
//			active_arr=tmp;
//		
//		return active_arr;
//	}
		else if(b%2==0) {
			tmp=func(b/2);
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					for(int k=0;k<arr[0].length;k++) {
						active_arr[i][j]+=(tmp[i][k]*tmp[k][j])%1000;
					}
				}
			}
		}
		else {
			tmp=func(b-1);
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					for(int k=0;k<arr[0].length;k++) {
						
						active_arr[i][j]+=(tmp[i][k]*arr[k][j])%1000;
					}
				}
			}
		}
		return active_arr;
	}

}
