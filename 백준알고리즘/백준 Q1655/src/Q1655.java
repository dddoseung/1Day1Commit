//ù �õ�:
//�켱���� ť�� ����ؼ� ť�� ���̿� ���� Ư�� �ε����� ť ���� �������� ��
//ť�� Ư�� �ε����� ���� ���� �� ����
//-> �������� poll�� ����ؾ� �ϴµ�
//   poll�� ���� ���� ���ŵǴ� ������ ��
//   
//�� ° �õ�:
//ArrayList�� �̿��ؼ� ���� �Էµ� ������ ������ �ؼ� ���� �������� ��
//�ð����⵵�� O(N*NlogN)�� �Ǿ� �ð��ʰ� ��
//
//**�ذ�å:
//MinHeap�� MaxHeap 2���� ����ؾ� ��.
//�ֳ��ϸ� ù �õ����� �������� 
//ť�� Ư�� �ε��� ���� ���� �� ���� ����
//�� Heap�� ����ؼ� ���� poll�� �� �ֵ��� �� ����.

// ��Ģ 1> �� Heap�� ���̰� ���� ��� �ԷµǴ� ���� MaxHeap�� �߰�
//  1-(1)> �� ���� MinHeap�� �ּڰ����� ũ�� swap
// ��Ģ 2> �� Heap�� ���̰� �ٸ� ��� �ԷµǴ� ���� MinHeap�� �߰�
//  2-(1)> �� ���� MaxHeap�� �ִ밪���� ������ swap

// �ᱹ maxHeap���� ��� peek�� �� �ְ� �ؾ� ��.
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
		// ��������
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		// ��������
		
		int x = Integer.parseInt(br.readLine());
		maxHeap.add(x);
		System.out.println(maxHeap.peek());
		
		int tmp;
		for(int i=1;i<N;i++) {
			x = Integer.parseInt(br.readLine());
			if(i%2!=0) { // ��Ģ 2
			// Ȧ���̸� �� ���� ���̰� �ٸ� ���̹Ƿ�
				tmp = maxHeap.peek();
				if(x<tmp) { // ��Ģ 2-(1)
					minHeap.add(maxHeap.poll());
					maxHeap.add(x);
				}else {
					minHeap.add(x);
				}
					
			}else { // ��Ģ 1
				tmp = minHeap.peek();
				if(x>tmp) { // ��Ģ 1-(1)
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
//			if(minHeap.size() != maxHeap.size()) { // ��Ģ2
//				minHeap.add(x);
//			}else { // ��Ģ1
//				maxHeap.add(x);
//			}
//			
//			if(minHeap.peek()<maxHeap.peek()) { // ��Ģ1-(1) & ��Ģ2-(1)
//				tmp=maxHeap.poll();
//				maxHeap.add(x);
//				minHeap.add(tmp);
//			}
//			sb.append(maxHeap.peek() + "\n");
//		}
//		System.out.println(sb);

	}

}
