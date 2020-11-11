import java.util.*;

public class Main{
    public static void substring(String abc,int start,int end){
        char a;
        char b;
        
        for(int i=0;i<end;i++){
            System.out.print(abc.charAt(start));
            start++;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        String abc=sc.nextLine();
        int start=sc.nextInt();
        int end=sc.nextInt();
        
        substring(abc,start,end);
        
    }
}

