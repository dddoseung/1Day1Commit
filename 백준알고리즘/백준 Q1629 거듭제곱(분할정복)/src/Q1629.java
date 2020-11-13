import java.util.*;
/*
 * 재귀함수를 이용한 거듭제곱 or 반복문을 이용한 거듭제곱
 *  -> 성능이 낮음. 실행을 n번만큼 해야하기 때문.(O(n))
 *  
 *  								------************----------
 *  <사용조건1>
 *  분할정복을 이용하면 개선할 수 있음.(O(logn))
 *   ex) 2^8=2^4 x 2^4
 *         2^15=2^7 x 2^7 x 2
 *         					---------************-----------
 *  <사용조건2>
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
		
		/*A를 B번 곱하고 C로 나눈 나머지를 구하라*/
		long A=sc.nextLong();
		long B=sc.nextLong();
		long C=sc.nextLong(); // 주의: 자료형이 long이므로 scanner 써야할듯
		
		System.out.println(pow(A%C,B,C));
	}

}
