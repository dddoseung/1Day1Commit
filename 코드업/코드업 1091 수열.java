import java.util.*;
import java.text.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong(); //long자료형은 정수일 때
        long m=sc.nextLong(); //double자료형은 실수일 때
        long d=sc.nextLong();
        long n=sc.nextLong();
        
        for(int i=1;i<n;i++){
            a=a*m+d;
        }
        DecimalFormat form=new DecimalFormat("0");
        System.out.println(form.format(a));
    }
}
