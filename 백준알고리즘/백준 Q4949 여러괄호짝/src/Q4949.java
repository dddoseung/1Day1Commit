import java.util.Stack; //Stack library 사용
import java.io.*;

//<원래 조건>- 전제: 한 문자를 스택에 넣을 때마다 검사(첫 stack.pop은 첫번째 문자)
/*조건1: "("이거나 "["이면 스택에 넣음
 * 조건2: ")"이면 stack.pop을 했을 때, "("이게 아니거나 비어있으면 NO
 *              "]"이면 stack.pop을 했을 때, "["이게 아니거나 비어있으면 NO
 *조건3: 마지막에 스택이 안 비어있으면 NO
 */
public class Q4949 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		while (str.equals(".") == false) {
			if(isTrue(str)==true) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
			str = br.readLine();
		}

	}

	public static boolean isTrue(String str) {
		Stack<Character> stack = new Stack<Character>();
		char[] arr = str.toCharArray(); // str의 문자 하나하나를 arr배열에 저장

		for (char one:arr) {
			if (one == '(' || one == ')' || one == '[' || one == ']') {
				if (one == '(' || one == '[') {
					stack.push(one);
				} else if (one == ')') {
					if(stack.isEmpty()==true || stack.pop() != '(') {
						return false;
					}
				} else if (one == ']') { 
					if(stack.isEmpty()==true ||stack.pop() != '[') {
						return false;
					}
				}
			}
		}
		// ex) [][][][]()(
		
		if(stack.isEmpty()==false) {
			return false;
		}
		
			return true;
}
}
