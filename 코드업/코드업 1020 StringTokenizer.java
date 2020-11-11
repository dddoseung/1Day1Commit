import java.util.StringTokenizer;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        
        StringTokenizer st=new StringTokenizer(str1,"-");
        /* StringTokenizer는 클래스임
            vs split은 메소드 */
            
        String num1=st.nextToken();
        String num2=st.nextToken();
        
        sc.close();
        System.out.printf(num1+num2);
            }
}
