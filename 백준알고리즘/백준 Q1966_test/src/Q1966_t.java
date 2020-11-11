import java.io.*;
import java.util.*;


/*
 * import java.util.Queue;
import java.util.LinkedList;  //자바에서 큐는 LInkedList를 활용해 생성해야 함

 * queue 값 추가 -> queue.offer(1);
 * queue 값 제거 -> queue.poll(); // 첫번째 값 반환하고 제거 (비어있으면 null반환)
 * queue 값 제거 -> queue.remove(); //첫번째 값 반환 안 하고 제거
 * queue 첫번째 값 반환-> queue.peek();
 * queue 초기화 -> queue.clear();
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
		
		int ts=Integer.parseInt(br.readLine()); //테스트케이스 수
		while(ts>0) {
			important=new ArrayList<idx>(); //리스트 선언
			String[] str=(br.readLine()).split(" ");
			int N=Integer.parseInt(str[0]); // 문서의 수(=queue에 들어갈 숫자들의 개수)
			int M=Integer.parseInt(str[1]); // 알고싶은 index번호
			
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
