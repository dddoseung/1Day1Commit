import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/* "��� �������� ���� ��� ���迡 �����ִ�" 
 *  �ּ����� �����̹Ƿ� �翬�� ���� ū ��ġ�� ���� �������� �����ؾ� ��*/

public class Q11047 {
	
	static int N; // ������ �� N����
	static int K; // ��ġ�� �� K�� ������ ��
	
	static int[] arr; // ������ ������ ��� �迭
	static int min=0; // �ּڰ�

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		
		arr=new int[N+1]; // index=1����!!
		for(int i=1;i<=N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=N;i>0;i--) {
			if(K>=arr[i]) { // ��ġ�� ���� ������ �������� �۾ƾ���
				min+=K/arr[i];
				K=K%arr[i];
			}
		}
		//Coin(K);
		System.out.println(min);
		
		
	}
	
	/* �ٸ� ���: ����Լ� �̿�
	public static int Coin(int money) {
		
		int tmp=0;
		
		if(money==0) {
			return 0;
		}
		else {
			for(int i=N;i>0;i--) {
				tmp=money/arr[i];
				if((tmp)!=0) { 
					min+=tmp;
					return Coin(money%arr[i]);
				}
			}
		}
		return 0;
	}
	*/
}
