import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
		
		/*��� 1-charAt���� ���� ��*/
//		Scanner sc=new Scanner(System.in);
//		
//		String str=sc.nextLine(); // ���ڿ� �Է¹���
//		sc.close();
//		
//		int a_cnt = 0, e_cnt=0, i_cnt=0, o_cnt=0, u_cnt=0; // �� ���ڰ� ������ �ش��ϸ� ������Ŵ
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
		
		
		/*��� 2 - split���� ���ڿ� ��*/
		Scanner sc=new Scanner(System.in);
		String[] str=(sc.nextLine()).split("");
		
		int a_cnt = 0, e_cnt=0, i_cnt=0, o_cnt=0, u_cnt=0; // �� ���ڰ� ������ �ش��ϸ� ������Ŵ
		
		for(int i=0;i<str.length;i++) { // ***********���ڿ� ���� �� �񱳴� ������ a.equals(b)
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
