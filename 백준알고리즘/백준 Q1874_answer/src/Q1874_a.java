import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
/*입력값을 arr배열에 저장
 * for문으로 숫자개수만큼 돌면서 stack에 push함
 *  stack.peek()==arr[index]면 pop -> index++하고 다시 검사
 * StringBuilder로 출력문자를 add함
 * 
 * */
public class Q1874_a {
	static int[] arr; // 입력값 저장
	static Stack<Integer> stack;
	
	public static void main(String[] args) throws IOException{
		stack = new Stack<Integer>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		int n = Integer.parseInt(br.readLine()); // n개가 입력될 것임
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