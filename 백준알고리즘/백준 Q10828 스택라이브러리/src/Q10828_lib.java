import java.util.Stack; //library ���
import java.util.Scanner;

public class Q10828_lib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		
		Stack<Integer> stack=new Stack<Integer>();
		//���� ���̺귯�� ��� ��, ������ �̷��� ��
		String str;
		
		for(int i=0;i<n;i++) {
			str=sc.next();
			if(str.contains("push")) { 
				//***���ڿ��� ���ԵǴ� �� �˾ƺ� ���� .contains()
				stack.push(sc.nextInt());
			}
			else if(str.equals("pop")) { 
				//***���ڿ� ���� �� ���� ���� .equals()
				System.out.println(stack.isEmpty()?-1:stack.pop());
				//���� for��
			}
			else if(str.equals("size")) {
				System.out.println(stack.size());
			}
			else if(str.equals("top")) {
				System.out.println(stack.isEmpty()?-1:stack.peek());
			}
			else {
				System.out.println(stack.isEmpty()?1:0);
			}
		}
	}

}
