import java.util.Stack; //library 사용
import java.util.Scanner;

public class Q10828_lib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		
		Stack<Integer> stack=new Stack<Integer>();
		//스택 라이브러리 사용 시, 선언은 이렇게 함
		String str;
		
		for(int i=0;i<n;i++) {
			str=sc.next();
			if(str.contains("push")) { 
				//***문자열에 포함되는 지 알아볼 때는 .contains()
				stack.push(sc.nextInt());
			}
			else if(str.equals("pop")) { 
				//***문자열 같은 지 비교할 때는 .equals()
				System.out.println(stack.isEmpty()?-1:stack.pop());
				//다항 for문
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
