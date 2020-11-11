import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextInt();
        System.out.println(func(num));
    }
    public static int func(int num){
        if(num==1 || num==2){
            return 1;
        }
        else{
            return func(num-2)+func(num-1);
        }
	
    }
}

