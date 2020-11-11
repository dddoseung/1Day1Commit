import java.util.Stack; //Stack library 사용
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9012{
	//<내가 생각한 조건>- 전제: 일단 stack에 문자열을 다 넣고 검사(첫 stack.pop은 마지막 문자)
	/* 조건1: 처음 stack.pop이 "("이면 NO 
	*					(=마지막 문자가 "("이면 NO)
	   조건2: stack.pop해서" )"이면 cnt++ , "("이면 cnt--   
	 * 			-> cnt가 음수 or 양수가 되면 NO
	 * 				 (=괄호 짝이 안맞으면 NO)
	 */
	
	//<원래 조건>- 전제: 한 문자를 스택에 넣을 때마다 검사(첫 stack.pop은 첫번째 문자)
	/*조건1: "("이거나 "["이면 스택에 넣음
	 * 조건2: ")"이면 stack.pop을 했을 때, "("이게 아니거나 비어있으면 NO
	 *              "]"이면 stack.pop을 했을 때, "["이게 아니거나 비어있으면 NO
	 *조건3: 마지막에 스택이 안 비어있으면 NO
	 */
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=T;i++) {
			Stack<String> stack=new Stack<String>();
			
			String tmp=br.readLine(); // ex) (())())
			String[] str=tmp.split(""); // ex) str[0]="("   str[1]=")" ......
			int cnt=1;
			
			for(int j=0;j<str.length;j++) {
				stack.push(str[j]);
			}
			if((stack.pop()).equals("(")) {
				//*************************************문자열 같은 지 비교하는 건 .equals() !!!!!!!!!!!!!!!!**********************************
				System.out.println("NO");
			}
			else {
				loop:
				for(int d=1;d<str.length;d++) {
					if((stack.pop()).equals("("))
						cnt--;
					else
						cnt++;
					if(cnt<0) {
						System.out.println("NO");
						break loop;
					}
				}
				if(cnt==0)
					System.out.println("YES");
				else if(cnt>0)
					System.out.println("NO");
			}
		}


	}

}