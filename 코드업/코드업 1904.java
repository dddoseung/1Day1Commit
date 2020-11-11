import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        
        func(start,end);
        
    }
    public static void func(int start,int end){
        if(start<=end){
            if(start%2==1){ // 홀수
                System.out.print(start+" ");
                func(start+1,end);
            }
            else{
                func(start+1,end);
            }
        }
        else{}
    }
    
}

