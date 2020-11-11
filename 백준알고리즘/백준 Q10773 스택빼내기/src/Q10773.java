import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/* Stack의 가장 큰 특징: 후입선출(LIFO)
 * 가장 최근에 쓴 수를 지우거나 빼낼 때
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
			// **stack이 비어있지 않으면 반복해라**
		sum+=stack.pop();
		}
		System.out.println(sum);
	}

}
