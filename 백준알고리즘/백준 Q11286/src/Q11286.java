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
					// 음수가 리턴되면 오른쪽 인자가 아래로 내려감(=우선순위 낮아짐)
				}else if(Math.abs(x1)==Math.abs(x2) && x1<x2) {
					// **********
					// 절대값이 가장 작은 값이 여러 개이면, 가장 작은 수를 출력
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
				if(val==null) { // Integer 변수일 때 null과 비교할 수 있음
					System.out.println("0");
				}else {
					System.out.println(val);
				}
			}
			
		}
		
	
	}

}
