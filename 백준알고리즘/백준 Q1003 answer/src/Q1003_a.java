import java.util.*;
							/* �ݺ������� Ǯ�� (��Ģ�� ã�Ƽ� ǰ)*/
public class Q1003_a{
	
	static int N[];
	static int f0,f1,f01;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=Integer.parseInt(sc.nextLine());
		N=new int[T];
		
		for(int i=0;i<T;i++) 
			N[i]=Integer.parseInt(sc.nextLine()); // �׽�Ʈ ���̽��� ���� �迭 (fibonacci(N))
		
		for(int i=0;i<N.length;i++) {
			count(N[i]);
			System.out.println(f0+" "+f1);
		}
	}
	
	public static void count(int n) {
		f0=1; // �ʱ�ȭ����� ��
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