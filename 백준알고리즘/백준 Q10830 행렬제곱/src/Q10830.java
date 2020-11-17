import java.util.Scanner;
import java.util.Arrays;

public class Q10830 {
	static long[][] arr; // 행렬
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(); // 행렬의 크기 NxN
		long B=sc.nextLong(); // 행렬을 B만큼 제곱
		arr=new long[N][N];
		
		for(int r=0;r<N;r++) {
			for(int c=0;c<N;c++) {
				arr[r][c]=sc.nextLong();
			}
		}
		sc.close();
		
		StringBuilder sb=new StringBuilder();
		long[][] result=func(B); // result = active_arr
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				sb.append(result[i][j]+ " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
		
	
//	public static long[][] pow(long[][] n, long B) {
//		if(B==1) {
//			return n;
//		}
//		long[][] num=func(n,(B/2)); // 복잡한 연산 결과를 num에 저장하고
//		long[][] tmp=num*num%1000; // 이미 계산된 num을 단순곱셈해준다.
//		
//		if(B%2==0) {
//			
//			return tmp;
//		}
//		else
//			return (tmp*n)%1000;
//	}
	public static long[][] func(long b) { // 행렬 연산
		long[][] active_arr=new long[arr.length][arr[0].length]; // static으로 위에서 선언하면 이상한 결과 나옴.
		long[][] tmp=new long[arr.length][arr[0].length];
		if(b==1) {
		     for (int i = 0; i < arr.length; i++) {
		         for (int j = 0; j < arr[0].length; j++) {
		           active_arr[i][j] = arr[i][j] % 1000;
		         }
		       }
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
						active_arr[i][j]+=(tmp[i][k]*tmp[k][j]);
					}
				}
			}
		}
		else {
			tmp=func(b-1);
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					for(int k=0;k<arr[0].length;k++) {
						
						active_arr[i][j]+=(tmp[i][k]*arr[k][j]);
					}
				}
			}
		}
		return active_arr;
	}

}
