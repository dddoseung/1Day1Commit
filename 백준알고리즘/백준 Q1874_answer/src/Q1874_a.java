import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
/*�Է°��� arr�迭�� ����
 * for������ ���ڰ�����ŭ ���鼭 stack�� push��
 *  stack.peek()==arr[index]�� pop -> index++�ϰ� �ٽ� �˻�
 * StringBuilder�� ��¹��ڸ� add��
 * 
 * */
public class Q1874_a {
	static int[] arr; // �Է°� ����
	static Stack<Integer> stack;
	
	public static void main(String[] args) throws IOException{
		stack = new Stack<Integer>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		int n = Integer.parseInt(br.readLine()); // n���� �Էµ� ����
		arr=new int[n+1];
		
		for(int i=1;i<=n;i++) {
			arr[i]= Integer.parseInt(br.readLine());
		}
		
		int idx=1;
		for(int i=1;i<=n;i++) {
			stack.push(i);
			sb.append("+\n");
			while(stack.peek()==arr[idx]) {
				stack.pop();
				sb.append("-\n");
				idx++;
				if(stack.isEmpty()==true)
					break;
			}
		}
		
		if(stack.isEmpty()==false) {
			System.out.println("NO");
		}
		else {
			System.out.println(sb);
		}


	}
}