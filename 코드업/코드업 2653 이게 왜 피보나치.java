// 방법1: 재귀와 메모이제이션을 이용한 피보나치 풀이
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

// 방법2: 반복문을 이용한 피보나치 풀이
//import java.io.*;

// public class Main {
// 	static int[] arr; // 피보나치 수를 담을 배열
	
// 	public static void main(String[] args) throws IOException{
// 		// TODO Auto-generated method stub
// 		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
// 	        int n = Integer.parseInt(reader.readLine());
// 	        arr=new int[n+1];
	        
// 	        arr[0]=2;
// 	        arr[1]=3;
	        
// 	        for(int i=2;i<n;i++){
// 	            arr[i]=arr[i-1]+arr[i-2];
// 	        }
	        
// 	        System.out.println(arr[n-1]);
// 	}
// }
