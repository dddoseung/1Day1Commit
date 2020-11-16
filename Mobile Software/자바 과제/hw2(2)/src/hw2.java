import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
		
		/*방법 1-charAt으로 문자 비교*/
//		Scanner sc=new Scanner(System.in);
//		
//		String str=sc.nextLine(); // 문자열 입력받음
//		sc.close();
//		
//		int a_cnt = 0, e_cnt=0, i_cnt=0, o_cnt=0, u_cnt=0; // 각 문자가 모음에 해당하면 증가시킴
//		
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)=='a'||str.charAt(i)=='A')
//				a_cnt++;
//			else if(str.charAt(i)=='e'||str.charAt(i)=='E')
//				e_cnt++;
//			else if(str.charAt(i)=='i'||str.charAt(i)=='I')
//				i_cnt++;
//			else if(str.charAt(i)=='o'||str.charAt(i)=='O')
//				o_cnt++;
//			else if(str.charAt(i)=='u'||str.charAt(i)=='U')
//				u_cnt++;
//			else {}
//		}
//		System.out.println("a: "+a_cnt+" e: "+e_cnt+" i: "+i_cnt+" o: "+o_cnt+" u: "+u_cnt);
		
		
		/*방법 2 - split으로 문자열 비교*/
		Scanner sc=new Scanner(System.in);
		String[] str=(sc.nextLine()).split("");
		
		int a_cnt = 0, e_cnt=0, i_cnt=0, o_cnt=0, u_cnt=0; // 각 문자가 모음에 해당하면 증가시킴
		
		for(int i=0;i<str.length;i++) { // ***********문자열 같은 지 비교는 무조건 a.equals(b)
			if(str[i].equals("a") || str[i].equals("A"))
				a_cnt++;
			else if(str[i].equals("e") || str[i].equals("E"))
				e_cnt++;
			else if(str[i].equals("i")|| str[i].equals("I"))
				i_cnt++;			
			else if(str[i].equals("o") || str[i].equals("O"))
				o_cnt++;	
			else if(str[i].equals("u") || str[i].equals("U"))
				u_cnt++;
			else {}
		}
		System.out.println("a: "+a_cnt+" e: "+e_cnt+" i: "+i_cnt+" o: "+o_cnt+" u: "+u_cnt);
	}

}
