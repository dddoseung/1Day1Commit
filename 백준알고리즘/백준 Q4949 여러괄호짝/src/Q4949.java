import java.util.Stack; //Stack library ���
import java.io.*;

//<���� ����>- ����: �� ���ڸ� ���ÿ� ���� ������ �˻�(ù stack.pop�� ù��° ����)
/*����1: "("�̰ų� "["�̸� ���ÿ� ����
 * ����2: ")"�̸� stack.pop�� ���� ��, "("�̰� �ƴϰų� ��������� NO
 *              "]"�̸� stack.pop�� ���� ��, "["�̰� �ƴϰų� ��������� NO
 *����3: �������� ������ �� ��������� NO
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
		char[] arr = str.toCharArray(); // str�� ���� �ϳ��ϳ��� arr�迭�� ����

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
