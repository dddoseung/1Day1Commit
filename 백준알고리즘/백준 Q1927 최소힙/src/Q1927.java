// 최소 힙 자료구조 문제

/* 우선순위 큐 (Priority Queue)
 *  : 우선순위를 먼저 결정하고 그 우선순위가 높은
 *    엘레먼트가 먼저 나가는 자료구조
 *    
 * 우선순위 큐는 "힙을 이용하여 구현"하는 것이 일반적임*/

/* 우선순위 큐 특징
 *  : 1. 높은 우선순위의 요소를 먼저 꺼내 처리함.
 *    2. 내부 요소는 힙으로 구성되어 이진트리 구조로 이루어짐.
 *    3. 내부구조가 힙으로 구성되어 있어 시간복잡도는 O(NlogN)
 *    4. 응급실과 같이 우선순위를 중시해야 할 때 쓰임.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue; // 우선순위 큐 라이브러리

public class Q1927 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 작은 수를 우선순위로
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			int x = Integer.parseInt(br.readLine());
			
			if(x==0) {
				Integer value=priorityQueue.poll(); // poll: 요소 반환 후 큐에서 제거
				if(value==null) {
					System.out.println("0");
				}else {
					System.out.println(value); 
				}
			}else {
				priorityQueue.add(x);
			}
		}
	}

}
