import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/* Stack�� ���� ū Ư¡: ���Լ���(LIFO)
 * ���� �ֱٿ� �� ���� ����ų� ���� ��
 */

public class Q10773 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<Integer>();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int K=Integer.parseInt(br.readLine());
		
		int tmp;
		for(int i=0;i<K;i++) {
			tmp=Integer.parseInt(br.readLine());
			
			if(tmp==0) {
				stack.pop();
			}
			else {
				stack.push(tmp);
			}
		}
		
		int sum=0;
		
		while(!stack.isEmpty()) {
			// **stack�� ������� ������ �ݺ��ض�**
		sum+=stack.pop();
		}
		System.out.println(sum);
	}

}
