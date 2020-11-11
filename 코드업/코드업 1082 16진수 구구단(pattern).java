import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        String str=sc.next(); //B
        
        boolean flag=Pattern.matches("^[A-Z]*$",str);
        
        if(flag==true){
            int num=Integer.parseInt(str,16);
           // int num=sc.nextInt(16); 도 된다.
          
            for(int i=1;i<16;i++){
                System.out.format("%X*%X=%X\n",num,i,num*i);
        }
        }
    }
}

