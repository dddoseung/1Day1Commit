import java.util.*;
import java.io.*;

/* ���� ó���� ������ ���ڴ� �����̹Ƿ�, ó���� ������ �� ���� ����
 * 
 * 55+20+15 - 20+20 - 30
 *  55+20+15 / 20+20 / 30  -> -�� split
 * (55+20+15) - (20+20+30) -> (-������ ��) - (-���� ��)
 * 
 *  ��, arr[0]�� +�����ϰ� arr[1]~�� +�����ؼ�, ���� ��
*/

public class Q1541 {
	static String[] arr;
	static String[] left_arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine(); 
		//  ex) str="40+20-10+30"
		sc.close();
		
		arr=str.split("\\-"); 
		// -�� split -> arr[0]=40+20 / arr[1]=10+30
		
		left_arr=arr[0].split("\\+"); 
		// +�� split -> left_arr[0]=40 / left_arr[1]=20
		
		int left=0; 
		// left_arr ���� (=arr[0] ����)
		for(int i=0;i<left_arr.length;i++) {
			left+=Integer.parseInt(left_arr[i]);
		}
		
		int right=0; 
		// arr[1]~ ����
		for(int i=1;i<arr.length;i++) {
			String[] tmp=arr[i].split("\\+");
			
			for(String j : tmp) {
				right+=Integer.parseInt(j);
			}
		}
		
		System.out.println(left-right);
		
	}

}
