//첫 시도:
//우선순위 큐를 사용해서 큐의 길이에 따라 특정 인덱스의 큐 값을 뽑으려고 함
//큐는 특정 인덱스의 값을 뽑을 수 없음
//-> 뽑으려면 poll을 사용해야 하는데
//   poll을 쓰면 값이 제거되니 문제가 됨
//   
//둘 째 시도:
//ArrayList를 이용해서 값이 입력될 때마다 정렬을 해서 값을 뽑으려고 함
//시간복잡도가 O(N*NlogN)이 되어 시간초과 됨
//
//**해결책:
//MinHeap과 MaxHeap 2개를 사용해야 함.
//왜냐하면 첫 시도에서 문제였던 
//큐가 특정 인덱스 값을 뽑을 수 없는 것을
//두 Heap을 사용해서 값을 poll할 수 있도록 한 것임.

// 규칙 1> 두 Heap의 길이가 같은 경우 입력되는 값을 MaxHeap에 추가
//  1-(1)> 그 값이 MinHeap의 최솟값보다 크면 swap
// 규칙 2> 두 Heap의 길이가 다른 경우 입력되는 값을 MinHeap에 추가
//  2-(1)> 그 값이 MaxHeap의 최대값보다 작으면 swap

// 결국 maxHeap에서 계속 peek할 수 있게 해야 함.
// ex) '7' 5 3 / 8 10
//https://youngest-programming.tistory.com/430

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Collections;

public class Q1655 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		StringBuilder sb= new StringBuilder();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		// 오름차순
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		// 내림차순
		
		int x = Integer.parseInt(br.readLine());
		maxHeap.add(x);
		System.out.println(maxHeap.peek());
		
		int tmp;
		for(int i=1;i<N;i++) {
			x = Integer.parseInt(br.readLine());
			if(i%2!=0) { // 규칙 2
			// 홀수이면 두 힙의 길이가 다른 것이므로
				tmp = maxHeap.peek();
				if(x<tmp) { // 규칙 2-(1)
					minHeap.add(maxHeap.poll());
					maxHeap.add(x);
				}else {
					minHeap.add(x);
				}
					
			}else { // 규칙 1
				tmp = minHeap.peek();
				if(x>tmp) { // 규칙 1-(1)
					maxHeap.add(minHeap.poll());
					minHeap.add(x);
				}else {
					maxHeap.add(x);
				}
			}
			sb.append(maxHeap.peek()+"\n");
		}
		System.out.println(sb);

//		for(int i=1;i<N;i++) {
//			x = Integer.parseInt(br.readLine());
//			if(minHeap.size() != maxHeap.size()) { // 규칙2
//				minHeap.add(x);
//			}else { // 규칙1
//				maxHeap.add(x);
//			}
//			
//			if(minHeap.peek()<maxHeap.peek()) { // 규칙1-(1) & 규칙2-(1)
//				tmp=maxHeap.poll();
//				maxHeap.add(x);
//				minHeap.add(tmp);
//			}
//			sb.append(maxHeap.peek() + "\n");
//		}
//		System.out.println(sb);

	}

}
