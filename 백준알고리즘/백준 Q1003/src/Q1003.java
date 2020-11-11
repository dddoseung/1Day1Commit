import java.util.*;

public class Q1003 {
					/* XXXXXX런타임 에러 뜸XXXXXXXXX*/
	static int[] N;
	static int[] arr=new int[40];
	static int cnt0;
	static int cnt1;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=Integer.parseInt(sc.nextLine());
		N=new int[T]; // 각각 40보다 작거나 같으므로 int 타입 가능.
		
		for(int i=0;i<T;i++) {
			N[i]=Integer.parseInt(sc.nextLine()); // 테스트 케이스 입력받음
		}
		
		for(int i=0;i<T;i++) {
			fibo(N[i]);
			System.out.println(cnt0+" "+cnt1);
			
			cnt0=0;  // 초기화해줌
			cnt1=0;	 // 초기화해줌
		}

	}
	
	public static void fibo(int n) {
		/* return값이 있게 되면 함수호출 시 그 값이 출력되므로 void 여야 함 */

		if(n==0) {
			cnt0++;
		}
		else if(n==1) {
			cnt1++;
		}
		else {
			if(arr[n]==0) {
				fibo(n-2);
				fibo(n-1);
				arr[n]=1;
			}
			else {
				return;
			}
		}
		for(int i=0;i<arr.length;i++) { // 수열 입력값들 초기화해줌
			arr[i]=0;
		}
		
	}

}

