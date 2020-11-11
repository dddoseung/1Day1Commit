import java.util.*;
import java.io.*;

/* 가장 처음과 마지막 문자는 숫자이므로, 처음에 음수가 올 리는 없음
 * 
 * 55+20+15 - 20+20 - 30
 *  55+20+15 / 20+20 / 30  -> -로 split
 * (55+20+15) - (20+20+30) -> (-만나기 전) - (-만난 후)
 * 
 *  즉, arr[0]을 +연산하고 arr[1]~를 +연산해서, 둘을 뺌
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
		// -로 split -> arr[0]=40+20 / arr[1]=10+30
		
		left_arr=arr[0].split("\\+"); 
		// +로 split -> left_arr[0]=40 / left_arr[1]=20
		
		int left=0; 
		// left_arr 연산 (=arr[0] 연산)
		for(int i=0;i<left_arr.length;i++) {
			left+=Integer.parseInt(left_arr[i]);
		}
		
		int right=0; 
		// arr[1]~ 연산
		for(int i=1;i<arr.length;i++) {
			String[] tmp=arr[i].split("\\+");
			
			for(String j : tmp) {
				right+=Integer.parseInt(j);
			}
		}
		
		System.out.println(left-right);
		
	}

}
