import java.io.*;

/* N을 받으면 2^N 크기의 배열을 만듦
 *  check함수를 통해 조건을 체크하고
 *  만족하면 return값을 보내서
 *  cnt를 증가하는 방식 */

public class Q1904 {
	
	static int N;
	static int cnt;
	static int[] arr; // N=2일 때 arr[0]=0 or 1 arr[1]=0 or 1 arr[2]=0 or 1 arr[3]=0 or 1

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		arr=new int[(int) Math.pow(2,N)];
		
		System.out.println(arr.length);
		
	}

}
