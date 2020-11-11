import java.util.*;

public class Main{
    public static void a(int[] arr,int count){
        int tmp=arr[count-1]; //5
        for(int i=count-1;i>0;i--){
            if(tmp>arr[i-1])
                tmp=arr[i-1];
            else
                continue;
        }
        System.out.println(tmp);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int count=Integer.parseInt(sc.nextLine()); //10
        int[] arr=new int[count];
        
        String str=sc.nextLine();
        String[] str2=str.split(" ");
        
        for(int i=0;i<count;i++){
            arr[i]=Integer.parseInt(str2[i]);
            
        }
        a(arr,count);
        
    }
}


    
        
