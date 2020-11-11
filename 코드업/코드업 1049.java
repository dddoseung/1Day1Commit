import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        
        if(num1>sc.nextInt()){
            System.out.println("1");
            
        }
        else{
            System.out.println("0");
        }
        sc.close();
    }
}
