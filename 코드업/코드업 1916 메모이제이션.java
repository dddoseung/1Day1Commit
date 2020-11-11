import java.io.*;

        /*메모이제이션: 
        
        반복되는 결과를 메모리에 저장 해놓고 
        다음에 같은 결과가 나올 때 
        다시 계산할 필요없이 빨리 실행 하는 기법*/

public class Main{
    
    static long[] arr=new long[200];
    
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            int num=Integer.parseInt(br.readLine());
            long result=func(num);
            
            System.out.println(result);
            
        }
        catch(NumberFormatException e){
            e.printStackTrace();
        }
    }
    public static long func(int n){
        if(n<=2){ // 초기값 설정
            return 1;
        }
        else if(arr[n-1]!=0){ //처음 값이 들어간 후
            return arr[n-1];
        }

        else{
            arr[n-1]=func(n-1)+func(n-2); /////////
            return arr[n-1]%10009;
        }
        
    }
}
