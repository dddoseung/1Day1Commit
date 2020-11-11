import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        
        System.out.format("%s\n",num<0 ? "minus":"plus");
        System.out.format("%s\n",num%2==0 ? "even":"odd");
        
    }    
}
