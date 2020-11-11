import java.util.*;
import java.text.DecimalFormat;

/* nCk= n!/(n-k)!k! */
public class Main{
        
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        int k=sc.nextInt(); 
        
        if(k<=n && k>=1 && n<=25){ //정의역 
            double fac_n=factorial(n);
               // double이 아니면 다른 값이 나옴
            double fac_k=factorial(k);
            double fac_nk=factorial(n-k);
            
            DecimalFormat form=new DecimalFormat("0");
            
            System.out.println(form.format((fac_n/fac_nk)/fac_k));

        }
    }
    
    public static double factorial(int num){
        if(num>0){
            return num*factorial(num-1);
        }
        else{
            return 1;
        }
    }
}
    
