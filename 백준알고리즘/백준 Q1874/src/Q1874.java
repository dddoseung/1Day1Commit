import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
/*arr[i]�迭�� ���� i��� ���ڰ� ���ÿ� ���� 1�� �ٲ㼭 ���� �ִ��� �˻�
 * output�迭�� ����� ���ڸ� ������
 * �Ұ����ϸ� output[0]�� "NO"�� ������
 * */


public class Q1874 {
	static int[] arr; // ���ÿ� �� ���� �ִ��� Ȯ���� ��
	static String[] output; // "+"�� "-"�� ����ϴ� ��¹迭
	static Stack<Integer> stack;
	static int f=1; // output�� �ε���
	
	public static void main(String[] args) throws IOException{
		stack = new Stack<Integer>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // n���� �Էµ� ����
		arr=new int[n+1];
		output = new String[2*n+1];
		
		//�Է¹��� (�Լ��� �Է�)
		for(int i=0;i<n;i++) {
			int target =  Integer.parseInt(br.readLine());		
			func(target);
			
		}
		if(output[0]==null) { // �����ϸ�
			for(int i=1;i<output.length;i++) {
				System.out.println(output[i]);
			}

		}
		else { // �Ұ����ϸ�
			System.out.println("NO");
		}


	}
	public static void func(int target) {
		
		if(stack.search(target)==-1) { // ���ڰ� ���ÿ� ������
			for(int i=1;i<=target;i++) {
				if(arr[i]!=0) { // ���� ���� ���� �ִٸ�
					continue;
				}
				else { // ���� ���� ���� ���ٸ�
					stack.push(i);
					arr[i]=1;
					output[f++]="+";
				}

			}
			stack.pop();
			output[f++]="-";
		}
		else { // ���ڰ� ���ÿ� ������
			if(stack.peek()==target) {
				stack.pop();
				output[f++]="-";
			}
			else {
				output[0]="NO"; // �Ұ����ϸ� output[0]�� NO�� �ٲ����
				
			}
		}
	}

}
