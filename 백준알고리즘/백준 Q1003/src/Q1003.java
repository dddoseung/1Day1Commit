import java.util.*;

public class Q1003 {
					/* XXXXXX��Ÿ�� ���� ��XXXXXXXXX*/
	static int[] N;
	static int[] arr=new int[40];
	static int cnt0;
	static int cnt1;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=Integer.parseInt(sc.nextLine());
		N=new int[T]; // ���� 40���� �۰ų� �����Ƿ� int Ÿ�� ����.
		
		for(int i=0;i<T;i++) {
			N[i]=Integer.parseInt(sc.nextLine()); // �׽�Ʈ ���̽� �Է¹���
		}
		
		for(int i=0;i<T;i++) {
			fibo(N[i]);
			System.out.println(cnt0+" "+cnt1);
			
			cnt0=0;  // �ʱ�ȭ����
			cnt1=0;	 // �ʱ�ȭ����
		}

	}
	
	public static void fibo(int n) {
		/* return���� �ְ� �Ǹ� �Լ�ȣ�� �� �� ���� ��µǹǷ� void ���� �� */

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
		for(int i=0;i<arr.length;i++) { // ���� �Է°��� �ʱ�ȭ����
			arr[i]=0;
		}
		
	}

}

