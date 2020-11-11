import java.io.*;
import java.util.*;


/*
 * import java.util.Queue;
import java.util.LinkedList;  //�ڹٿ��� ť�� LInkedList�� Ȱ���� �����ؾ� ��

 * queue �� �߰� -> queue.offer(1);
 * queue �� ���� -> queue.poll(); // ù��° �� ��ȯ�ϰ� ���� (��������� null��ȯ)
 * queue �� ���� -> queue.remove(); //ù��° �� ��ȯ �� �ϰ� ����
 * queue ù��° �� ��ȯ-> queue.peek();
 * queue �ʱ�ȭ -> queue.clear();
*/

class idx{
	int value;
	int index;
	idx(int val, int idx){
		this.value=val;
		this.index=idx;
	}
}
public class Q1966_t{
	static ArrayList<idx> important;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int ts=Integer.parseInt(br.readLine()); //�׽�Ʈ���̽� ��
		while(ts>0) {
			important=new ArrayList<idx>(); //����Ʈ ����
			String[] str=(br.readLine()).split(" ");
			int N=Integer.parseInt(str[0]); // ������ ��(=queue�� �� ���ڵ��� ����)
			int M=Integer.parseInt(str[1]); // �˰���� index��ȣ
			
			String[] tmp=(br.readLine()).split(" ");

			for(int i=0;i<N;i++) {
				idx IDX=new idx(Integer.parseInt(tmp[i]),i);
				important.add(new idx(IDX.value,IDX.index));
			}
			func(important,0,M);
			ts--;
		}
	}
	public static void func(ArrayList<idx> queue, int n,int M) {
		if(n==queue.size()-1) {
			for(int i=0;i<queue.size();i++) {
				if(queue.get(i).index==M) {
					System.out.println(i);
					break;
				}
				else {}
			}

			return;
		}
		else {
			loop:
				for(int i=1;i<queue.size();i++) {
				if((int) queue.get(n).value>=(int) queue.get(i).value) {
					continue;
				}
				else {
					int tmp=(int) queue.get(n).value;
					int tmp_idx=(int) queue.get(n).index;
					queue.remove(0);
					queue.add(new idx(tmp,tmp_idx));
					n--;
					break loop;
				}
			}
			func(queue,++n,M);
			
		}
		}


}
