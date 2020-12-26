// �ּ� �� �ڷᱸ�� ����

/* �켱���� ť (Priority Queue)
 *  : �켱������ ���� �����ϰ� �� �켱������ ����
 *    ������Ʈ�� ���� ������ �ڷᱸ��
 *    
 * �켱���� ť�� "���� �̿��Ͽ� ����"�ϴ� ���� �Ϲ�����*/

/* �켱���� ť Ư¡
 *  : 1. ���� �켱������ ��Ҹ� ���� ���� ó����.
 *    2. ���� ��Ҵ� ������ �����Ǿ� ����Ʈ�� ������ �̷����.
 *    3. ���α����� ������ �����Ǿ� �־� �ð����⵵�� O(NlogN)
 *    4. ���޽ǰ� ���� �켱������ �߽��ؾ� �� �� ����.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue; // �켱���� ť ���̺귯��

public class Q1927 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ���� ���� �켱������
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			int x = Integer.parseInt(br.readLine());
			
			if(x==0) {
				Integer value=priorityQueue.poll(); // poll: ��� ��ȯ �� ť���� ����
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
