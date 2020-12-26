import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Q11286 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(N,new Comparator<Integer>() {
			@Override
			public int compare(Integer x1, Integer x2) {
				if(Math.abs(x1)<Math.abs(x2)) {
					return -1; 
					// ������ ���ϵǸ� ������ ���ڰ� �Ʒ��� ������(=�켱���� ������)
				}else if(Math.abs(x1)==Math.abs(x2) && x1<x2) {
					// **********
					// ���밪�� ���� ���� ���� ���� ���̸�, ���� ���� ���� ���
					return -1; 
				}else{
					return 1;
				}
			}
		});
		
		for(int i=0;i<N;i++) {
			int x = Integer.parseInt(br.readLine());
			if(x!=0) {
				priorityQueue.add(x);
			}
			else {
				Integer val = priorityQueue.poll();
				if(val==null) { // Integer ������ �� null�� ���� �� ����
					System.out.println("0");
				}else {
					System.out.println(val);
				}
			}
			
		}
		
	
	}

}
