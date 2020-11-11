import java.util.Scanner;
import java.util.StringTokenizer;

/*���� : ���Լ��� ��� push: 1 2 3 pop: 3 2 1
 * 
 * push X: ���� X�� ���ÿ� �ִ� �����̴�.
 * 
pop: ���ÿ��� ���� ���� �ִ� ������ '����', �� ���� ����Ѵ�. 
���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.

size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.

empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.

top: ������ ���� ���� �ִ� ������ '���� �ʰ�', �� ���� ����Ѵ�. 
���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 * */

public class Q10828 {
	public static void main(String[] args) {
		
		ListStack stack=new ListStack(); 
		//����� ���� ������ ��, ������ �̷��� ��
		
		Scanner sc=new Scanner(System.in);
		//StringTokenizer st;
		int N=Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<N;i++) {
			//st=new StringTokenizer(sc.nextLine());
			String tmp=sc.next();
			if(tmp.equals("push")) { // ***���ڿ� ���� �� ���� ���� .equals() 
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

 // Linked-List�� Stack �����ϱ� //

//���� ����Ʈ�� ����� ��� class
class Node {

	private Object data;
	private Node nextNode;

	public Node(Object item){
		this.data = item;
		this.nextNode = null;
	}

	//�ش� ��带 ���ϴ� ���(Node top)�� �������ִ� �޼ҵ�
	public void linkNode(Node top){
		this.nextNode = top;
	}
	
	//�ش� ����� �����͸� �������� get�޼ҵ�
	public Object getData(){
		return this.data;
	}

	//�ش� ���� ����� ��带 �������� get�޼ҵ�
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
			return 1; // ������ ��������� 1 ���
		else
			return 0;
	}
	public void push(Object item) {
		Node newNode = new Node(item); // �켱 ��带 ���� �ϳ� ����
		newNode.linkNode(top); // ���θ��� ���� ������ ���(top)�� ��������
		top=newNode; // ���ο� ��尡 ���� �տ� ������ top���� ǥ������
		
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
			
			Object item=top(); // ��� �뵵�� ���� �����͸� ��ȯ
			top=top.getNextNode(); //������ ���� top�� ���� ��� (���� ����� ���� ���)
			return item;
		}
	}
	public int size() {
		return size;
	}
}





