import java.io.*;

/* N�� ������ 2^N ũ���� �迭�� ����
 *  check�Լ��� ���� ������ üũ�ϰ�
 *  �����ϸ� return���� ������
 *  cnt�� �����ϴ� ��� */

public class Q1904 {
	
	static int N;
	static int cnt;
	static int[] arr; // N=2�� �� arr[0]=0 or 1 arr[1]=0 or 1 arr[2]=0 or 1 arr[3]=0 or 1

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		arr=new int[(int) Math.pow(2,N)];
		
		System.out.println(arr.length);
		
	}

}
