import java.util.*;

public class Main{
    
    static int[] arr=new int[21];

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        
        System.out.println(fibo(n));
    }

public static int fibo(int n){
    if(n==1){
        return 2;
    }
    else if(n==2){
        return 3;
    }
    else{
        if(arr[n]==0){ //값이 저장 안되어있으면
            arr[n]=fibo(n-1)+fibo(n-2);
            return arr[n];
        }
        else{
            return arr[n];
        }
          
    }
    
}
}
