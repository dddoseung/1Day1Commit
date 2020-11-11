import java.util.*;

public class Main{

    public static int gcd(int a,int b){ //최대공약수 구하는 유클리드 알고리즘
            if(b==0)
                return a;
            return gcd(b,a%b);
        }
        
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[3];
        int i=0;
        
        while(sc.hasNext()){
            arr[i]=sc.nextInt();
            i++;
        }
        
        int first=arr[0];
        for(int j=1;j<arr.length;j++){
            first=first*arr[j]/gcd(first,arr[j]);
        }
        System.out.println(first);
    }
}
    