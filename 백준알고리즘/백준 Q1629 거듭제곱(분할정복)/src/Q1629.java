import java.util.*;
/*
 * ����Լ��� �̿��� �ŵ����� or �ݺ����� �̿��� �ŵ�����
 *  -> ������ ����. ������ n����ŭ �ؾ��ϱ� ����.(O(n))
 *  
 *  								------************----------
 *  <�������1>
 *  ���������� �̿��ϸ� ������ �� ����.(O(logn))
 *   ex) 2^8=2^4 x 2^4
 *         2^15=2^7 x 2^7 x 2
 *         					---------************-----------
 *  <�������2>
 *    						 a%c == (a%c) % c
 *       ex) 30 % 4 == (30 % 4) % 4 == 2 % 4
 *                        2        ==           2
 *        -> a^b % c == (a%c)^b % c ??????????????
*/

public class Q1629 {
	
	public static long pow(long n, long s, long c) {
		if(s==0) {
			return 1;
		}
		long num=pow(n,(s/2),c)%c;
		long tmp=num*num%c;
		
		if(s%2==0) {
			return tmp;
		}
		else
			return (tmp*n)%c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		/*A�� B�� ���ϰ� C�� ���� �������� ���϶�*/
		long A=sc.nextLong();
		long B=sc.nextLong();
		long C=sc.nextLong(); // ����: �ڷ����� long�̹Ƿ� scanner ����ҵ�
		
		System.out.println(pow(A%C,B,C));
	}

}
