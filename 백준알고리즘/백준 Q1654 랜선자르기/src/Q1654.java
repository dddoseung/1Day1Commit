import java.io.*;
import java.util.Arrays;
//�������� �̺�Ž�� ����

public class Q1654 {
	
	static int N;
	static long[] arr;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		int K=Integer.parseInt(str[0]); //�����ִ� ������ ����
		N=Integer.parseInt(str[1]); //�ʿ��� ������ ����
		
		arr=new long[K];
		for(int i=0;i<K;i++) {
			arr[i]=Long.parseLong(br.readLine());
		}
		
		Arrays.sort(arr);
		System.out.print(BSearch(arr));
	}

	public static long BSearch(long[] arr) { 
							// �������� �̺�Ž��������, low�� high�� ���� index���� �ƴϴ�.
		long mid=0;
		long low=1; // ������ ���̴� 2^31-1���� �۰ų� ���� `�ڿ���`
		long high=arr[arr.length-1];

		while(low<=high) {
			int cnt=0;
			mid=(low+high)/2;
			for(long a:arr) {
				cnt+=a/mid;
			}
			if(cnt>=N)
				low=mid+1;
			
			else
				high=mid-1;

		}
		return high; 								
								//   ���� 32�� ��,
	    						//
								//		low 33 high 40
								//
								//		low 33 high 35
								//
								//		low 33 high 33
								//
								//		low 33 high 32 
							    //
								//     �ݺ��� ��������
	}
}
