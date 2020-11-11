import java.util.*;
							/* 반복문으로 풀기 (규칙을 찾아서 품)*/
public class Q1003_a{
	
	static int N[];
	static int f0,f1,f01;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=Integer.parseInt(sc.nextLine());
		N=new int[T];
		
		for(int i=0;i<T;i++) 
			N[i]=Integer.parseInt(sc.nextLine()); // 테스트 케이스를 넣은 배열 (fibonacci(N))
		
		for(int i=0;i<N.length;i++) {
			count(N[i]);
			System.out.println(f0+" "+f1);
		}
	}
	
	public static void count(int n) {
		f0=1; // 초기화해줘야 함
		f1=0; //
		f01=f0+f1; //
		
		if(n!=0) {
			for(int i=0;i<n;i++) {
				f0=f1;
				f1=f01;
				f01=f0+f1;
			}
		}
	}

}