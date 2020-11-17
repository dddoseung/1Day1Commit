import java.io.*;

// �� ������ �Ϲ����� �Ǻ���ġ+�޸������̼����ε� ��Ÿ���� �ʰ��ȴ�.
//�׷��Ƿ� "�ǻ�� �ֱ�"�� ���� �̿��ؾ� ��.

//�Ǻ���ġ ���� ���� ���� K=10^n�̶�� �� ��, �ǻ�� �ֱ�� 15*10^(n-1)�̴�.
//��, k�� 10�� 6������ 1,000,000�̸�, �ǻ�� �ֱ�� 1,500,000�̴�.
//1,500,000��° ������ �Ǻ���ġ ���� K�� ���� ������ ������ ���ϸ� 
//�� ������ ���� ����� �ʿ䰡 ���ٴ� �Ҹ��̴�.


public class Q2749 {
	static long[] arr; // �Ǻ���ġ ���� ���� �迭
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	       long n = Long.parseLong(reader.readLine());
	        // 1 <= n <= 1,000,000,000,000,000,000

		int pisano=1500000; // �������� K�� K=10^6�̹Ƿ�!

		while(n>pisano) {
			n%=pisano;
		}
		
		arr=new long[(int) (n+1)];
		
		arr[0]=0;
		arr[1]=1;
		
		for(int i=2;i<=n;i++) {
				arr[i]=(arr[i-1]+arr[i-2])%1000000;
			}

	System.out.print(arr[(int)n]);
	}
	
}
