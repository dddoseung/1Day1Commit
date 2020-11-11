import java.util.*;
import java.text.DecimalFormat;

public class Main{
    public static int func(int num){ //각 자리수 더하기
        
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        
        return sum;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(); // num=1234567
        
        num=func(num); // num=func(1234567)

        while(num/10!=0){
            num=func(num);
        }
        System.out.println(num);
        
    }
}