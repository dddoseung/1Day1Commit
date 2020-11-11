import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextInt(); //100(까지의 합)
        
        System.out.println(func(num));
    }
    
    public static int func(int num){
        if(num>0){
            return num+func(num-1);
        }
        else{
            return 0;
        }
    }
    
}

