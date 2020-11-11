import java.util.*;
import java.text.DecimalFormat;

public class Main{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        double num=1;
        
        while(sc.hasNext()){
            num*=sc.nextInt();
        }
        num=num/(8*Math.pow(2,10)*Math.pow(2,10));
        
        //DecimalFormat form=new DecimalFormat("0.0"); 소수점 첫째자리까지
        System.out.format("%.1f MB",num);
    }
}

