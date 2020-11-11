import java.util.Stack; //Stack library ���
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9012{
	//<���� ������ ����>- ����: �ϴ� stack�� ���ڿ��� �� �ְ� �˻�(ù stack.pop�� ������ ����)
	/* ����1: ó�� stack.pop�� "("�̸� NO 
	*					(=������ ���ڰ� "("�̸� NO)
	   ����2: stack.pop�ؼ�" )"�̸� cnt++ , "("�̸� cnt--   
	 * 			-> cnt�� ���� or ����� �Ǹ� NO
	 * 				 (=��ȣ ¦�� �ȸ����� NO)
	 */
	
	//<���� ����>- ����: �� ���ڸ� ���ÿ� ���� ������ �˻�(ù stack.pop�� ù��° ����)
	/*����1: "("�̰ų� "["�̸� ���ÿ� ����
	 * ����2: ")"�̸� stack.pop�� ���� ��, "("�̰� �ƴϰų� ��������� NO
	 *              "]"�̸� stack.pop�� ���� ��, "["�̰� �ƴϰų� ��������� NO
	 *����3: �������� ������ �� ��������� NO
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
				//*************************************���ڿ� ���� �� ���ϴ� �� .equals() !!!!!!!!!!!!!!!!**********************************
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