//import java.io.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.StringTokenizer;
import java.util.Scanner;

public class Q10816 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		int[] card = new int[20000001]; // -10000000 <= 정수 <= 10000000
		
		for (int i = 0; i < N; i++) {
			 ++card[10000000+sc.nextInt()] ; 
			 //예를 들어, 정수가 -1000이면 card[10000000-1000]에 1 추가
		}
		int M = sc.nextInt();
		
		for (int i = 0; i < M; i++) {
			sb.append(card[10000000+sc.nextInt()]+" ");
		}		
		sc.close();
		System.out.println(sb.toString());
	}

}
//public class Q10816 {
//	static boolean val=false;
//
//	public static void main(String[] args) throws IOException{
//		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int N=Integer.parseInt(br.readLine());
//		int[] arr=new int[N];
//		String[] tmp=br.readLine().split(" ");
//		
//		ArrayList <Integer> list=new ArrayList<Integer>();
//		
//		for(int i=0;i<N;i++) {
//			arr[i]=Integer.parseInt(tmp[i]);
//		}
//		Arrays.sort(arr);
//		
//		for(int i=0;i<N;i++) {
//			list.add(arr[i]);
//		}
//		
//		int M=Integer.parseInt(br.readLine());
//		StringTokenizer st=new StringTokenizer(br.readLine()," ");
//		
//		for(int i=0;i<M;i++) {
//			int num=0;
//			int tmp2=Integer.parseInt(st.nextToken());
//
//			BSearch(list,tmp2);
//			while(val==true) {
//				num++;
//				BSearch(list,tmp2);
//
//			}
//			System.out.print(num+" ");
//		}
//	}
//	
//	public static void BSearch(ArrayList<Integer> list, int target) {
//		val=false;
//		int low=0;
//		int high=list.size()-1;
//		int mid;
//		
//		while(low<=high) {
//			mid=(low+high)/2;
//			
//			if(list.get(mid)==target) {
//				list.remove(mid);
//				val=true;
//				break;
//			}
//			else if(list.get(mid)>target)
//				high=mid-1;
//			else
//				low=mid+1;
//
//		}
//	}
//
//}
