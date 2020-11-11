import java.util.Scanner;
import java.util.StringTokenizer;

/*스택 : 후입선출 방식 push: 1 2 3 pop: 3 2 1
 * 
 * push X: 정수 X를 스택에 넣는 연산이다.
 * 
pop: 스택에서 가장 위에 있는 정수를 '빼고', 그 수를 출력한다. 
만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

size: 스택에 들어있는 정수의 개수를 출력한다.

empty: 스택이 비어있으면 1, 아니면 0을 출력한다.

top: 스택의 가장 위에 있는 정수를 '빼지 않고', 그 수를 출력한다. 
만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * */

public class Q10828 {
	public static void main(String[] args) {
		
		ListStack stack=new ListStack(); 
		//사용자 정의 스택일 시, 선언은 이렇게 함
		
		Scanner sc=new Scanner(System.in);
		//StringTokenizer st;
		int N=Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<N;i++) {
			//st=new StringTokenizer(sc.nextLine());
			String tmp=sc.next();
			if(tmp.equals("push")) { // ***문자열 같은 지 비교할 때는 .equals() 
				stack.push(Integer.parseInt(sc.next()));
			}
			else if(tmp.equals("pop")) {
				System.out.println(stack.pop());
			}
			else if(tmp.equals("top")) {
				System.out.println(stack.top());
			}
			else if(tmp.equals("empty")) {
				System.out.println(stack.isEmpty());
			}
			else {
				System.out.println(stack.size());
			}
				
			}
		}
		
		
	}

 // Linked-List로 Stack 구현하기 //

//연결 리스트로 사용할 노드 class
class Node {

	private Object data;
	private Node nextNode;

	public Node(Object item){
		this.data = item;
		this.nextNode = null;
	}

	//해당 노드를 원하는 노드(Node top)와 연결해주는 메소드
	public void linkNode(Node top){
		this.nextNode = top;
	}
	
	//해당 노드의 데이터를 가져오는 get메소드
	public Object getData(){
		return this.data;
	}

	//해당 노드와 연결된 노드를 가져오는 get메소드
	public Node getNextNode(){
		return this.nextNode;
	}
}

class ListStack{
	private Node top;
	private int size;
	
	public ListStack() {
		top=null;
	}
	public int isEmpty() {
		if(top==null)
			return 1; // 스택이 비어있으면 1 출력
		else
			return 0;
	}
	public void push(Object item) {
		Node newNode = new Node(item); // 우선 노드를 새로 하나 만듦
		newNode.linkNode(top); // 새로만든 노드와 이전의 노드(top)를 연결해줌
		top=newNode; // 새로운 노드가 가장 앞에 있으니 top으로 표시해줌
		
		size++;
	}
	public Object top() { // (=peek())
		if(isEmpty()==1) {
			return -1;
		}
		else {
			return top.getData();
		}
	}
	public Object pop() {
		if(isEmpty()==1) {
			return -1;
		}
		else {
			size--;
			
			Object item=top(); // 백업 용도로 지울 데이터를 반환
			top=top.getNextNode(); //오른쪽 항의 top은 지울 노드 (지울 노드의 이전 노드)
			return item;
		}
	}
	public int size() {
		return size;
	}
}





