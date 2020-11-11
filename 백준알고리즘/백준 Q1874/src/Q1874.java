import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
/*arr[i]배열을 만들어서 i라는 숫자가 스택에 들어가면 1로 바꿔서 들어간적 있는지 검사
 * output배열로 출력할 문자를 저장함
 * 불가능하면 output[0]에 "NO"를 저장함
 * */


public class Q1874 {
	static int[] arr; // 스택에 들어간 적이 있는지 확인할 것
	static String[] output; // "+"와 "-"를 출력하는 출력배열
	static Stack<Integer> stack;
	static int f=1; // output의 인덱스
	
	public static void main(String[] args) throws IOException{
		stack = new Stack<Integer>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // n개가 입력될 것임
		arr=new int[n+1];
		output = new String[2*n+1];
		
		//입력받음 (함수에 입력)
		for(int i=0;i<n;i++) {
			int target =  Integer.parseInt(br.readLine());		
			func(target);
			
		}
		if(output[0]==null) { // 가능하면
			for(int i=1;i<output.length;i++) {
				System.out.println(output[i]);
			}

		}
		else { // 불가능하면
			System.out.println("NO");
		}


	}
	public static void func(int target) {
		
		if(stack.search(target)==-1) { // 숫자가 스택에 없으면
			for(int i=1;i<=target;i++) {
				if(arr[i]!=0) { // 만약 넣은 적이 있다면
					continue;
				}
				else { // 만약 넣은 적이 없다면
					stack.push(i);
					arr[i]=1;
					output[f++]="+";
				}

			}
			stack.pop();
			output[f++]="-";
		}
		else { // 숫자가 스택에 있으면
			if(stack.peek()==target) {
				stack.pop();
				output[f++]="-";
			}
			else {
				output[0]="NO"; // 불가능하면 output[0]을 NO로 바꿔버림
				
			}
		}
	}

}
