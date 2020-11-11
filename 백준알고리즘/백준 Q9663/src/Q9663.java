import java.io.*;
import java.util.*;

public class Q9663 {

	static int N; // N x N�� ü���� ���� �� N���� ���� ���� ���ϰ� ��ġ
	static int[] arr; // ü�� ���� �� ���� ��ġ��� ����
	static int count=0; // ����� �� ī��Ʈ�ٿ�
	
	/*
	 * 1. ���ȣ���� ��� �� ���ΰ�
	 * 2. ���� ���� �� �ִ� �� ���θ� ���ǹ����� �Ǻ��� ���ΰ�
	 */
	
	public static void NQueen(int depth) { // ���ȣ�� �κ�
		if(depth==N) { // ���� �� ä������ ī��Ʈ�ٿ� 1 ������Ű�� "����"��Ŵ
			count++;
			return;
		}
		
		for(int i=0;i<N;i++) {
				//  (arr[depth]=i;) O
				
				if(possible(depth,i)) {
					arr[depth]=i; //!!!������ ������ �ٲٰ�
					NQueen(depth+1);
					/*			dfs���ȣ���� for�� �ȿ���				*/
					
				}
				else {
					arr[depth]=0;
					return;
				}
		}
	}
	
	public static boolean possible(int num,int value) { // ���� ���� �� �ִ� ���� �Ǻ�
		for(int i=0;i<num;i++) { // !!! num(=���� depth �ٷ� ��)������ �˻�
			if(arr[i]==value) { // ���� ���� ���
				return false;
			}
			else if(Math.abs(num-i)==Math.abs(value-arr[i])) { // �밢���� ���
				      // ���� ���� ���� ���� ���� ��찡 �밢���� ���� ����̴�.
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(st.nextToken()); 
		arr=new int[N];
		
		NQueen(0);
		System.out.println(count);
	}

}
